package com.example.demo.controller;

import java.time.LocalDate;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.User;
import com.example.demo.model.Account;
import com.example.demo.repository.UserRepository;

import jakarta.servlet.http.HttpSession;

@Controller
public class AccountController {
	@Autowired
	HttpSession session;
	@Autowired
	Account account;
	@Autowired
	UserRepository userRepository;

	// 管理者ログイン画面表示
	@GetMapping({ "/admin/login", "/admin/logout" })

	public String adminIndex(Model model) {
		// セッション情報を全てクリアする
		session.invalidate();
		// エラーパラメータのチェック

		return "adminLogin";
	}

	// 管理者ログイン実行
	@PostMapping("/admin/login")
	public String adminlogin(
			@RequestParam(name = "adminId", defaultValue = "") String adminId,
			@RequestParam(name = "password", defaultValue = "") String password,
			Model model) {
		if (adminId.equals("") || password.equals("")) {
			model.addAttribute("error", "未入力の項目があります");
			return "adminLogin";
		}

		if (adminId.equals("admin") && password.equals("himitu")) {
			return "userLogin";
		}

		model.addAttribute("error", "ID ・ Password が一致しません");
		return "adminLogin";
	}

	// ユーザーログイン画面表示
	@GetMapping({ "/user/login", "/user/logout" })
	public String userIndex(Model model) {
		// セッション情報を全てクリアする
		session.invalidate();
		// エラーパラメータのチェック
		return "userLogin";
	}

	// ユーザーログイン実行
	@PostMapping("/user/login")
	public String userlogin(
			@RequestParam(name = "mail", defaultValue = "") String mail,
			@RequestParam(name = "password", defaultValue = "") String password,
			Model model) {
		
		User info = null;
		
		if (mail.equals("") || password.equals("")) {
			model.addAttribute("error", "未入力の項目があります");
			return "userLogin";
		}

		if (userRepository.findAllByMailAndPassword(mail, password) != null) {
			info = userRepository.findAllByMailAndPassword(mail, password);
		}

		if (info != null) {
			account.setName(info.getName());
			account.setId(info.getId());
			return "adminLogin";
		}

		model.addAttribute("error", "メールアドレスとパスワードが一致しません");
		return "userLogin";
	}

	// 新規登録画面表示
	@GetMapping("/user/add")
	public String create() {
		return "addUser";
	}

	// 新規登録実行
	@PostMapping("/user/login/add")
	public String createUser(
			@RequestParam(name = "name", defaultValue = "") String name,
			@RequestParam(name = "birthday", defaultValue = "") LocalDate birthday,
			@RequestParam(name = "address", defaultValue = "") String address,
			@RequestParam(name = "mail", defaultValue = "") String mail,
			@RequestParam(name = "tel", defaultValue = "") String tel,
			@RequestParam(name = "accountName", defaultValue = "") String accountName,
			@RequestParam(name = "password", defaultValue = "") String password,
			Model model) {
		ArrayList<String> errorlist = new ArrayList<String>();

		if (name.equals("") || name.length() == 0) {
			errorlist.add("名前は必須です");
		}
		if (birthday.equals("")) {
			errorlist.add("生年月日は必須です");
		}
		if (address.equals("") || address.length() == 0) {
			errorlist.add("住所は必須です");
		}
		if (mail.equals("") || mail.length() == 0) {
			errorlist.add("メールアドレスは必須です");
		}
		if (tel.equals("") || tel.length() == 0) {
			errorlist.add("電話番号は必須です");
		}
		if (password.equals("")) {
			errorlist.add("パスワードは必須です");
		}
		if (accountName.equals("") || accountName.length() == 0) {
			errorlist.add("アカウント名は必須です");
		}
		
//		User users = userRepository.findAllByMail(mail);
//		if (users != null) {
//			list.add("登録済みのメールアドレスです");
//		}
		if (errorlist.size() != 0) {
			model.addAttribute("errorlist", errorlist);
			return "addUser";
		}
		
		User user = new User(name, birthday, address, mail, tel, password, accountName);
		userRepository.save(user);
		
		return "redirect:/user/login";
	}
}

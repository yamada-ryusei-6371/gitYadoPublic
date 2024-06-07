package com.example.demo.controller;

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

		if (!(8 <= password.length() && password.length() <= 20)) {
			model.addAttribute("error", "パスワードは8文字以上、２０文字以下です");
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
	@GetMapping("#")
	public String create() {
		return "#";
	}

	// 新規登録実行
}

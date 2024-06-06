package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.repository.UserRepository;

import jakarta.servlet.http.HttpSession;

@Controller
public class AccountController {
	@Autowired
	HttpSession session;
	@Autowired
	UserRepository userRepository;

	// 管理者ログイン画面表示
	@GetMapping({ "/adminlogin", "/adminlogout" })
	public String adminIndex(Model model) {
		// セッション情報を全てクリアする
		session.invalidate();
		// エラーパラメータのチェック

		return "adminLogin";
	}
	
	// 管理者ログイン実行
	
	// ログイン画面表示
		@GetMapping({ "/userlogin", "/userlogout" })
		public String userIndex(Model model) {
			// セッション情報を全てクリアする
			session.invalidate();
			// エラーパラメータのチェック

			return "userLogin";
		}
		
		// 管理者ログイン実行

	// 新規登録画面表示
	@GetMapping("#")
	public String create() {
		return "#";
	}
	
	// 新規登録実行
}

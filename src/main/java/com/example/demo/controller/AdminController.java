package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.User;
import com.example.demo.repository.CustomerRepository;
import com.example.demo.repository.UserRepository;

@Controller
public class AdminController {

	@Autowired
	CustomerRepository customerRepository;

	@Autowired
	UserRepository userRepository;

	@GetMapping("/admin/user")
	public String index(
			@RequestParam("name") String name,
			@RequestParam("account") String account,
			@RequestParam("email") String email,
			Model model) {

		List<User> userList1 = new ArrayList<User>();

		if (!name.equals("") && !account.equals("") && !email.equals("")) {
			List<User> userList2 = userRepository.findAllByMailAndAccountName(email, account);
			for (User user : userList2) {
				if (user.getName().contains(name)) {
					userList1.add(user);
				}
			}
		} else if (!name.equals("") && !account.equals("")) {
			List<User> userList2 = userRepository.findByAccountName(account);
			for (User user : userList2) {
				if (user.getName().contains(name)) {
					userList1.add(user);
				}
			}
		} else if (!account.equals("") && !email.equals("")) {
			userList1 = userRepository.findAllByMailAndAccountName(email, account);
		} else if (!name.equals("") && !email.equals("")) {
			List<User> userList2 = userRepository.findByMail(email);
			for (User user : userList2) {
				if (user.getName().contains(name)) {
					userList1.add(user);
				}
			}
		} else if (!name.equals("")) {
			List<User> userList2 = userRepository.findAll();
			for (User user : userList2) {
				if (user.getName().contains(name)) {
					userList1.add(user);
				}
			}
		} else if (!account.equals("")) {
			userList1 = userRepository.findByAccountName(account);
		} else if (!email.equals("")) {
			userList1 = userRepository.findByMail(email);
		} else {
			userList1 = userRepository.findAll();
		}

		model.addAttribute("userList", userList1);
		return "infoUser";
	}

	@GetMapping("/admin/customer")
	public String index(
			@RequestParam("yadoname") String yadoname,
			@RequestParam("ken") String ken,
			Model model) {

		List<User> userList1 = new ArrayList<User>();

		return "infoYado";
	}
}

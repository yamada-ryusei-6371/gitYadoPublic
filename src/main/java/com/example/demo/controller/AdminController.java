package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.Customer;
import com.example.demo.entity.User;
import com.example.demo.repository.CustomerRepository;
import com.example.demo.repository.UserRepository;

@Controller
public class AdminController {

	@Autowired
	CustomerRepository customerRepository;

	@Autowired
	UserRepository userRepository;

	@GetMapping("/admin/top")
	public String admintop(Model model) {
		return "adminTop";
	}

	@GetMapping("/admin/user")
	public String usertop(Model model) {
		List<User> userList = userRepository.findAll();
		model.addAttribute("userList", userList);
		return "infoUser";
	}

	@GetMapping("/admin/user/result")
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

	@GetMapping("/user/{id}/update")
	public String update(
			@PathVariable("id") Integer id, Model model) {
		User user = userRepository.findById(id).get();
		model.addAttribute("users", user);

		return "updateUser";
	}

	@GetMapping("/admin/customer")
	public String customertop(Model model) {
		List<Customer> customerList = customerRepository.findAllByOrderById();
		model.addAttribute("customerList", customerList);
		return "infoYado";
	}

	@GetMapping("/admin/customer/result")
	public String index(
			@RequestParam("yadoname") String yadoname,
			@RequestParam("ken") String ken,
			Model model) {

		List<Customer> customerList1 = customerRepository.findAll();
		List<Customer> customerList2 = new ArrayList<Customer>();

		if (!yadoname.equals("") && !ken.equals("")) {
			for (Customer customer : customerList1) {
				if (customer.getHotelName().contains(yadoname)) {
					if (customer.getAddress().contains(ken)) {
						customerList2.add(customer);
					}
				}
			}
		} else if (!yadoname.equals("")) {
			for (Customer customer : customerList1) {
				if (customer.getHotelName().contains(yadoname)) {
					customerList2.add(customer);
				}
			}
		} else if (!ken.equals("")) {
			for (Customer customer : customerList1) {
				if (customer.getAddress().contains(ken)) {
					customerList2.add(customer);
				}
			}
		} else {
			customerList2 = customerRepository.findAll();
		}

		model.addAttribute("customerList", customerList2);
		return "infoYado";
	}

	// 更新画面表示
	@GetMapping("/admin/customer/{id}/edit")
	public String edit(@PathVariable("id") Integer id, Model model) {

		Customer customer = customerRepository.findById(id).get();
		model.addAttribute("customer", customer);

		return "updateYado";
	}

	// 更新処理
	@PostMapping("/admin/customer/{id}/edit")
	public String update(
			@PathVariable("id") Integer id,
			@RequestParam(value = "hotelName", defaultValue = "") String hotelName,
			@RequestParam(value = "price", defaultValue = "") Integer price,
			@RequestParam(value = "address", defaultValue = "") String address,
			@RequestParam(value = "hotelTel", defaultValue = "") String hotelTel,
			@RequestParam(value = "information", defaultValue = "") String information,
			@RequestParam(value = "hotelRoom", defaultValue = "") Integer hotelRoom,
			@RequestParam(value = "image", defaultValue = "") String image,
			Model model) {

		// Itemオブジェクトの生成
		Customer customer = new Customer(id, hotelName, price, address, hotelTel, information, hotelRoom, image);
		// itemsテーブルへの反映（UPDATE）
		customerRepository.save(customer);
		// 「/items」にGETでリクエストし直せ（リダイレクト）
		return "redirect:/admin/customer";
	}

	// 削除処理
	@PostMapping("/admin/customer/{id}/delete")
	public String delete(@PathVariable("id") Integer id, Model model) {

		// itemsテーブルから削除（DELETE）
		customerRepository.deleteById(id);
		// 「/items」にGETでリクエストし直せ（リダイレクト）
		return "redirect:/admin/customer";
	}

}

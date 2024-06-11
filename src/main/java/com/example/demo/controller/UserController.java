package com.example.demo.controller;

import java.time.LocalDate;
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
import com.example.demo.entity.Inquiry;
import com.example.demo.entity.Reservation;
import com.example.demo.entity.Star;
import com.example.demo.entity.User;
import com.example.demo.model.Account;
import com.example.demo.repository.CustomerRepository;
import com.example.demo.repository.InquiryRepository;
import com.example.demo.repository.ReservationRepository;
import com.example.demo.repository.StarRepository;
import com.example.demo.repository.UserRepository;

@Controller
public class UserController {

	@Autowired
	CustomerRepository customerRepository;

	@Autowired
	UserRepository userRepository;

	@Autowired
	ReservationRepository reservationRepository;

	@Autowired
	InquiryRepository inquiryRepository;

	@Autowired
	StarRepository starRepository;

	@Autowired
	Account account;

	//	@GetMapping("/userTop")
	//	public String userTop(
	//			@RequestParam("id") Integer id,
	//			@RequestParam("name") String name,
	//			@RequestParam("year") String year,
	//			@RequestParam("month") String month,
	//			@RequestParam("day") String day,
	//			@RequestParam("address") String address,
	//			@RequestParam("mail") String mail,
	//			@RequestParam("tel") String tel,
	//			@RequestParam("password") String password,
	//			@RequestParam("point") Integer point,
	//			@RequestParam("accountName") String accountName,
	//			Model model) {
	//		User user = userRepository.findById(1).get();
	//		model.addAttribute("user", user);
	//		return "myPage";
	//	}

	@GetMapping("/userTop")
	public String index(@RequestParam(name = "name", defaultValue = "") String name,
			@RequestParam(name = "ken", defaultValue = "") String ken,
			@RequestParam(name = "date", defaultValue = "") LocalDate date,
			@RequestParam(name = "people", defaultValue = "") Integer people,
			Model model) {

		List<Customer> customerList1 = customerRepository.findAll();
		List<Customer> customerList2 = new ArrayList<Customer>();
		if (!name.equals("") && !ken.equals("")) {
			for (Customer customer : customerList1) {
				if (customer.getHotelName().contains(name)) {
					if (customer.getAddress().contains(ken)) {
						customerList2.add(customer);
					}
				}
			}
		} else if (!name.equals("")) {
			for (Customer customer : customerList1) {
				if (customer.getHotelName().contains(name)) {
					customerList2.add(customer);
				}
			}
		} else if (!ken.equals("")) {
			for (Customer customer : customerList1) {
				if (customer.getAddress().contains(ken)) {
					customerList2.add(customer);
				}
			}
		}
		if (customerList2.size() == 0) {
			customerList2 = customerRepository.findAll();
		}

		model.addAttribute("customerList", customerList2);

		return "hotel";
	}

	@GetMapping("/hotel")
	public String hotel(@RequestParam("id") Integer id,
			Model model) {
		Customer customer = customerRepository.findById(id).get();
		model.addAttribute("customer", customer);

		return "hotelDetail";
	}

	//マイページ
	@GetMapping("/mypage/{id}")
	public String editId(@PathVariable("id") Integer id, Model model) {
		User user = userRepository.findById(id).get();
		model.addAttribute("user", user);

		return "myPage";
	}

	@GetMapping("/updateUser/{id}")
	public String updateUser(@PathVariable("id") Integer id, Model model) {
		User user = userRepository.findById(id).get();
		model.addAttribute("user", user);
		return "updateUser";
	}

	@GetMapping("/finUpdateUser/{id}")
	public String userTop(
			@PathVariable("id") Integer id,
			@RequestParam("name") String name,
			@RequestParam("year") String year,
			@RequestParam("month") String month,
			@RequestParam("day") String day,
			@RequestParam("address") String address,
			@RequestParam("mail") String mail,
			@RequestParam("tel") String tel,
			@RequestParam("password") String password,
			@RequestParam("point") Integer point,
			@RequestParam("accountName") String accountName,
			Model model) {

		User original = userRepository.findOneById(id);

		ArrayList<String> errorlist = new ArrayList<String>();

		if (name.equals("") || name.length() == 0) {
			errorlist.add("名前は必須です<br>");
		}
		if (year.equals("") || month.equals("") || day.equals("")) {
			errorlist.add("生年月日は必須です<br>");
		}
		if (address.equals("") || address.length() == 0) {
			errorlist.add("住所は必須です<br>");
		}
		if (mail.equals("") || mail.length() == 0) {
			errorlist.add("メールアドレスは必須です<br>");
		}
		if (tel.equals("") || tel.length() == 0) {
			errorlist.add("電話番号は必須です<br>");
		}
		if (accountName.equals("") || accountName.length() == 0) {
			errorlist.add("アカウント名は必須です<br>");
		}
		if (password.equals("")) {
			errorlist.add("パスワードは必須です<br>");
		}

		List<User> userList = userRepository.findAll();

		for (User users : userList) {
			// 対象の商品IDが見つかった場合削除す
			if (users.getMail().equals(mail)) {
				if (users.getId() != id) {
					errorlist.add("そのメールアドレスは使用済みです<br>");
					break;
				}
			}
		}

		for (User users : userList) {
			// 対象の商品IDが見つかった場合削除す
			if (users.getTel().equals(tel)) {
				if (users.getId() != id) {
					errorlist.add("その電話番号は使用済みです<br>");
					break;
				}
			}
		}
		for (User users : userList) {
			// 対象の商品IDが見つかった場合削除す
			if (users.getAccountName().equals(accountName)) {
				if (users.getId() != id) {
					errorlist.add("そのアカウント名は使用済みです<br>");
					break;
				}
			}
		}
		for (User users : userList) {
			// 対象の商品IDが見つかった場合削除す
			if (users.getPassword().equals(password)) {
				if (users.getId() != id) {
					errorlist.add("そのパスワードは使用済みです<br>");
					break;
				}
			}
		}
		if (errorlist.size() == 0) {
			User user = new User(name, year, month, day, address, mail, tel, password, accountName);
			userRepository.save(user);
			return "updateUserComplete";
		} else {
			model.addAttribute("errorlist", errorlist);
			model.addAttribute("user", original);
			return "updateUser";
		}
	}

	@GetMapping("/deleteUser/{id}")
	public String deleteUser(@PathVariable("id") Integer id, Model model) {
		User user = userRepository.findById(id).get();
		model.addAttribute("user", user);
		return "deleteUser";
	}

	@PostMapping("/deleteComplete")
	public String deleteComplete(
			@RequestParam("id") Integer id,
			Model model) {
		userRepository.deleteById(id);
		return "deleteUserComplete";
	}
	//マイページここまで

	@GetMapping("/history")
	public String history() {
		return "history";
	}

	@GetMapping("/history/{id}")
	public String hostory(@PathVariable("id") Integer userId, Model model) {
		List<Reservation> reserve = reservationRepository.findAll();

		List<Reservation> history = new ArrayList<>();
		for (Reservation reservation : reserve) {
			if (reservation.getUserId() == userId) {
				history.add(reservation);
			}
		}
		if (history.size() > 0) {
			model.addAttribute("history", history);
		}
		return "history";
	}

	@GetMapping("/reserve/change")
	public String change(
			@RequestParam("history") Reservation history,
			Model model) {
		model.addAttribute("history", history);
		return "changeReserve";

	}

	@GetMapping("/reserve/cancel")
	public String cancel(
			@RequestParam("history") Reservation history,
			Model model) {
		model.addAttribute("history", history);
		return "cancelReserve";
	}

	@GetMapping("/reserve/cancel/fin")
	public String cancelFin(
			@RequestParam("history") Reservation history,
			Model model) {

		reservationRepository.deleteById(history.getId());

		return "finCancel";
	}

	@GetMapping("/reserve/change/fin")
	public String changeFin(
			@RequestParam("history") Reservation history,
			@RequestParam("human") int human,
			@RequestParam("date") LocalDate date,
			@RequestParam("hour") int hour,
			Model model) {
		String Application1 = "";
		String Application2 = "";
		String Application3 = "";
		if (history.getHuman() != human) {
			Application1 = "人数を" + human + "人に更新する申請が来ました。<br>";
		}
		if (!(history.getHotelDay().isEqual(date))) {
			Application2 = "日付を" + date + "に更新する申請が来ました。<br>";
		}
		if (history.getCheckIn() != hour) {
			Application3 = "チェックイン時間を" + hour + "に更新する申請が来ました。<br>";
		}

		String Application = "Application1" + "Application2" + "Application3";
		Inquiry inquiry = new Inquiry(Application, history.getId(), date, hour, human);
		inquiryRepository.save(inquiry);

		return "finChangeRepository";
	}

	//レビュー画面表示
	@GetMapping("/reviews")
	public String review(
			@RequestParam("id") Integer hotelId,
			Model model) {

		List<Star> StarList = starRepository.findByHotelId(hotelId);
		Customer customer = customerRepository.findById(hotelId).get();

		model.addAttribute("customer", customer);
		if (StarList.size() == 0) {
			model.addAttribute("message", "レビューがありません");
			return "reviews";
		}
		model.addAttribute("starList", StarList);
		return "reviews";
	}

	//レビュー書き込み画面表示
	@GetMapping("/writeReviews")
	public String writeReview(
			@RequestParam("id") Integer hotelId, Model model) {

		model.addAttribute("hotelId", hotelId);
		return "writeReviews";
	}

	//レビュー書き込み
	@PostMapping("/writeReviews")
	public String writeReviews(
			@RequestParam("id") Integer hotelId,
			@RequestParam("accountName") String accountName,
			@RequestParam("star") Integer star,
			@RequestParam("evalue") String evalue,
			Model model) {

		Star review = new Star(accountName, account.getId(), hotelId, evalue, star);
		starRepository.save(review);

		return "redirect:/reviews?id=" + hotelId;
	}

	//	@PostMapping("/reserve/content/{id}")
	//	public String reserveContent(
	//			@PathVariable("id") Integer hotelId,
	//			@RequestParam("human") Integer human,
	//			@RequestParam("date") LocalDate date,
	//			@RequestParam("hour") Integer hour,
	//			@RequestParam("price") Integer price,
	//			@RequestParam("userId") Integer userId,
	//			Model model) {
	//
	//		LocalTime cheakIn = LocalTime.of(hour, 00);
	//
	//		Reservation reserve = new Reservation(userId, hotelId, price, date, cheakIn, human);
	//
	//		model.addAttribute("reserve", reserve);
	//
	//		return "reserveConfilm";
	//	}
}
package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.User;
import com.example.demo.model.Account;
import com.example.demo.repository.CustomerRepository;
import com.example.demo.repository.UserRepository;

@Controller
public class UserController {

	@Autowired
	CustomerRepository customerRepository;
	
	@Autowired
	UserRepository userRepository;

	@Autowired
	Account account;
	
	@GetMapping("/userTop")
	public String userTop(
			@RequestParam("id") Integer id,
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
		User user = userRepository.findById(1).get();
		model.addAttribute("user", user);
		return "myPage";
	}
	
	@GetMapping("/updateUser")
	public String updateUser(Model model) {
//		User user = userRepository.findById(account.getId()).get();
		User user = userRepository.findById(1).get();
		model.addAttribute("user",user);
		return "updateUser";
	}
	
	@PostMapping("/mypage")
	public String updateUser(
			@RequestParam("id") Integer id,
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
		
		User user = new User(id, name, year, month, day, address, mail, tel,
							password, accountName, point);
		userRepository.save(user);
		return "updateUserComplete";
	}
	
	@GetMapping("/history")
	public String history() {
		return "history";
	}
	
	@GetMapping("/deleteUser")
	public String deleteUser(Model model) {
//		User user = userRepository.findById(account.getId()).get();
		User user = userRepository.findById(1).get();
		model.addAttribute("user",user);
		return "deleteUser";
	}
	
	@PostMapping("/deleteComplete")
	public String deleteComplete(
			@RequestParam("id") Integer id,
			@RequestParam("taikai") String taikai,
			Model model) {
		return "deleteUserComplete";
	}
	
	//@GetMapping("/userTop")
	//public String index(@RequestParam("name") String name,
			//@RequestParam("ken") String ken,
			//@RequestParam("date") LocalDate date,
			//@RequestParam("people") Integer people,
			//Model model) {

		//List<Customer> customerList1 = customerRepository.findAll();
		//List<Customer> customerList2 = new ArrayList<Customer>();
		//if (!name.equals("") && !ken.equals("")) {
			//for (Customer customer : customerList1) {
				//if (customer.getHotelName().contains(name)) {
					//if (customer.getAddress().contains(ken)) {
						//customerList2.add(customer);
					//}
				//}
			//}
		//} else if (!name.equals("")) {
			//for (Customer customer : customerList1) {
				//if (customer.getHotelName().contains(name)) {
					//customerList2.add(customer);
				//}
			//}
		//} else if (!ken.equals("")) {
			//for (Customer customer : customerList1) {
				//if (customer.getAddress().contains(ken)) {
					//customerList2.add(customer);
				//}
			//}
		//}
		//if (customerList2.size() == 0) {
			//if (!name.equals("") || !ken.equals("")) {

			//}
			//customerList2 = customerRepository.findAll();
		//}

		//model.addAttribute("customerList", customerList2);

		//return "hotel";
	//}

	//@GetMapping("/hotel")
	//public String hotel(@RequestParam("id") Integer id,
			//Model model) {
		//Customer customer = customerRepository.findById(id).get();
		//model.addAttribute("customer", customer);

		//return "hotelDetail";
	//}
	
	//@PostMapping("/reserve/content/{id}")
	//public String reserveContent(
			//@PathVariable("id") Integer hotelId,
			//@RequestParam("human") Integer human,
			//@RequestParam("date") LocalDate date,
			//@RequestParam("hour") Integer hour,
			//@RequestParam("price") Integer price,
			//@RequestParam("userId") Integer userId,
			//Model model) {
		
		//LocalTime cheakIn = LocalTime.of(hour, 00);
		
		//Reservation reserve = new Reservation(userId, hotelId, price, date, cheakIn, human);
		
		//model.addAttribute("reserve",reserve);
		
		//return "reserveConfilm";
	//}
}
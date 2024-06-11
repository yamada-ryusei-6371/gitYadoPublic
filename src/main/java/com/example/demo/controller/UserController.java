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

import com.example.demo.entity.Inquiry;
import com.example.demo.entity.Reservation;
import com.example.demo.entity.User;
import com.example.demo.model.Account;
import com.example.demo.repository.CustomerRepository;
import com.example.demo.repository.InquiryRepository;
import com.example.demo.repository.ReservationRepository;
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
	
	@GetMapping("/history/{id}")
	 public String hostory( @PathVariable("id") Integer userId,Model model) {
		 List<Reservation> reserve = reservationRepository.findAll();
		    	
		 List<Reservation> history = new ArrayList<>();		    	
		    for (Reservation reservation : reserve) {
		    	if (reservation.getUserId() == userId) {
					history.add(reservation);
				}
			}		    	
		    if(history.size() > 0) {
		    	model.addAttribute("history",history);
		    	}
		    return "history";
	 }
	 
	 @GetMapping("/reserve/change")
	 public String change(
			 @RequestParam("history") Reservation history,
			 Model model) {
		 model.addAttribute("history",history);
		 return "changeReserve";
		 
	 }
	 
	 @GetMapping("/reserve/cancel")
	 public String cancel(
			 @RequestParam("history") Reservation history,
			 Model model) {
		 model.addAttribute("history",history);
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
		 if(history.getHuman() != human)
			 Application1 = "人数を"+ human + "人に更新する申請が来ました。<br>";
		 if(!(history.getHotelDay().isEqual(date)))
			 Application2 = "日付を" + date + "に更新する申請が来ました。<br>"; 
		 if(history.getCheckIn() != hour)
			 Application3 = "チェックイン時間を" + hour + "に更新する申請が来ました。<br>"; 
		 String Application = "Application1" + "Application2" + "Application3";
		 
		 
		 Inquiry inquiry = new Inquiry(Application,history.getId());
		 
		 inquiryRepository.save(inquiry);
		 
		 return "finChangeRepository";
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
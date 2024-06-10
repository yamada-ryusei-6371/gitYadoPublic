package com.example.demo.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.Customer;
import com.example.demo.entity.Reservation;
import com.example.demo.model.Account;
import com.example.demo.repository.CustomerRepository;
import com.example.demo.repository.ReservationRepository;

@Controller
public class UserController {

	@Autowired
	CustomerRepository customerRepository;

	@Autowired
	ReservationRepository reservationRepository;

	@Autowired
	Account account;

	@GetMapping("/userTop")
	public String index(
			@RequestParam(name = "name", defaultValue = "") String name,
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

	@PostMapping("/hotel")
	public String reservation(
			@RequestParam(name = "time", defaultValue = "") Integer time,
			@RequestParam(name = "people", defaultValue = "") Integer people,
			@RequestParam(name = "id", defaultValue = "") Integer id,
			@RequestParam(name = "name", defaultValue = "") String name,
			@RequestParam(name = "price", defaultValue = "") Integer price,
			@RequestParam(name = "address", defaultValue = "") String address,
			@RequestParam(name = "image", defaultValue = "") String image,
			@RequestParam(name = "date", defaultValue = "") LocalDate date,
			Model model) {
		LocalDate days = LocalDate.now();
		boolean d1 = date.isBefore(days);
		if (d1 == true) {
			model.addAttribute("error", "使えない日付です");
			return "hotelDetail";
		}

		LocalDate futureDate = days.plusYears(1);

		boolean d2 = date.isAfter(futureDate);
		if (d2 == true) {
			model.addAttribute("error", "１年以内の日付を選択してください");
			return "hotelDetail";
		}

		Reservation reservation = new Reservation(0, id, price, date, time, people, name, image);
		model.addAttribute("reservation", reservation);

		return "reserveConfilm";
	}

	@PostMapping("/hotel/check")
	public String check(
			@RequestParam("time") Integer time,
			@RequestParam("people") Integer people,
			@RequestParam("id") Integer id,
			@RequestParam("name") String name,
			@RequestParam("price") Integer price,
			@RequestParam("address") String address,
			@RequestParam("image") String image,
			@RequestParam("date") LocalDate date,
			Model model) {

		Reservation reservation = new Reservation(0, id, price, date, time, people, name, image);
		reservationRepository.save(reservation);

		return "/";
	}

}

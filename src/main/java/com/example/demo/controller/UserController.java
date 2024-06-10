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
import com.example.demo.model.Account;
import com.example.demo.repository.CustomerRepository;

@Controller
public class UserController {

	@Autowired
	CustomerRepository customerRepository;

	@Autowired
	Account account;

	@GetMapping("/")
	public String index(@RequestParam("name") String name,
			@RequestParam("ken") String ken,
			@RequestParam("date") LocalDate date,
			@RequestParam("people") Integer people,
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
			if (!name.equals("") || !ken.equals("")) {

			}
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
			@RequestParam("time") Integer time,
			@RequestParam("people") Integer people,
			@RequestParam("id") Integer id,
			@RequestParam("name") String name,
			@RequestParam("price") Integer price,
			@RequestParam("address") String address,
			@RequestParam("image") String image,
			Model model) {

		return "reserveConfile";
	}

}

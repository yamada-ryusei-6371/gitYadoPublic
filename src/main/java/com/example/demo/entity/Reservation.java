package com.example.demo.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "reservations")
public class Reservation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "user_id")
	private Integer userId;
	@Column(name = "hotel_id")
	private Integer hotelId;
	private Integer price;
	@Column(name = "hotel_day")
	private LocalDate hotelDay;
	private LocalTime checkIn;
	private Integer human;

	public Reservation() {
	}

	public Reservation(Integer id, Integer userId, Integer hotelId, Integer price,
			LocalDate hotelDay, LocalTime checkIn, Integer human) {
		this.userId = userId;
		this.hotelId = hotelId;
		this.price = price;
		this.hotelDay = hotelDay;
		this.checkIn = checkIn;
		this.human = human;
	}

	public Reservation(Integer userId, Integer hotelId, Integer price,
			LocalDate hotelDay, LocalTime checkIn, Integer human) {
		this.userId = userId;
		this.hotelId = hotelId;
		this.price = price;
		this.hotelDay = hotelDay;
		this.checkIn = checkIn;
		this.human = human;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getHotelId() {
		return hotelId;
	}

	public void setHotelId(Integer hotelId) {
		this.hotelId = hotelId;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public LocalDate getHotelDay() {
		return hotelDay;
	}

	public void setHotelDay(LocalDate hotelDay) {
		this.hotelDay = hotelDay;
	}

	public LocalTime getCheckIn() {
		return checkIn;
	}

	public void setCheckIn(LocalTime checkIn) {
		this.checkIn = checkIn;
	}

	public Integer getHuman() {
		return human;
	}

	public void setHuman(Integer human) {
		this.human = human;
	}

}

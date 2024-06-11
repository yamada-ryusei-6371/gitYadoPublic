package com.example.demo.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "inquiry")
public class Inquiry {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String contents;
	@Column(name = "reserve_id")
	private Integer reserveId;
	@Column(name = "hotel_day")
	private LocalDate hotelDay;
	private Integer checkIn;
	private Integer human;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public Integer getReserveId() {
		return reserveId;
	}

	public void setReserveId(Integer reserveId) {
		this.reserveId = reserveId;
	}

	public Inquiry() {
	}

	public LocalDate getHotelDay() {
		return hotelDay;
	}

	public void setHotelDay(LocalDate hotelDay) {
		this.hotelDay = hotelDay;
	}

	public Integer getCheckIn() {
		return checkIn;
	}

	public void setCheckIn(Integer checkIn) {
		this.checkIn = checkIn;
	}

	public Integer getHuman() {
		return human;
	}

	public void setHuman(Integer human) {
		this.human = human;
	}

	public Inquiry(Integer id, String contents, Integer reserveId, LocalDate hotelDay, Integer checkIn, Integer human) {
		this.id = id;
		this.contents = contents;
		this.reserveId = reserveId;
		this.hotelDay = hotelDay;
		this.checkIn = checkIn;
		this.human = human;
	}

	public Inquiry(String contents, Integer reserveId, LocalDate hotelDay, Integer checkIn, Integer human) {
		this.contents = contents;
		this.reserveId = reserveId;
		this.hotelDay = hotelDay;
		this.checkIn = checkIn;
		this.human = human;
	}
}

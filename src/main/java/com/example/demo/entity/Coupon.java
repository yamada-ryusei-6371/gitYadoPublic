package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "favorites")
public class Coupon {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "user_id")
	private Integer userId;
	@Column(name = "hotel_id")
	private Integer hotelId;
	private String coupon;

	public Coupon() {
	}

	public Coupon(Integer id, Integer userId, Integer hotelId, String coupon) {
		this.id = id;
		this.userId = userId;
		this.hotelId = hotelId;
		this.coupon = coupon;
	}

	public Coupon(Integer userId, Integer hotelId, String coupon) {
		this.userId = userId;
		this.hotelId = hotelId;
		this.coupon = coupon;
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

	public String getCoupon() {
		return coupon;
	}

	public void setCoupon(String coupon) {
		this.coupon = coupon;
	}

}

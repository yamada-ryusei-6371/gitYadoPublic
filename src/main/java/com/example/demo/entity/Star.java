package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "stars")
public class Star {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "account_name")
	private String accountName;
	@Column(name = "user_id")
	private String userId;
	@Column(name = "hotel_id")
	private Integer hotelId;
	private String evalue;
	private Integer star;

	public Star() {
	}

	public Star(Integer id, String accountName, Integer hotelId, String evalue, Integer star) {
		this.id = id;
		this.accountName = accountName;
		this.hotelId = hotelId;
		this.evalue = evalue;
		this.star = star;
	}

	public Star(String accountName, Integer hotelId, String evalue, Integer star) {
		this.accountName = accountName;
		this.hotelId = hotelId;
		this.evalue = evalue;
		this.star = star;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public Integer getHotelId() {
		return hotelId;
	}

	public void setHotelId(Integer hotelId) {
		this.hotelId = hotelId;
	}

	public String getEvalue() {
		return evalue;
	}

	public void setEvalue(String evalue) {
		this.evalue = evalue;
	}

	public Integer getStar() {
		return star;
	}

	public void setStar(Integer star) {
		this.star = star;
	}

}

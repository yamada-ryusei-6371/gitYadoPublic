package com.example.demo.entity;

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
	private Integer userId;
	private Integer hotelId;
	private String evalue;
	private Integer star;

	public Star() {
	}

	public Star(Integer id, Integer userId, Integer hotelId, String evalue, Integer star) {
		this.id = id;
		this.userId = userId;
		this.hotelId = hotelId;
		this.evalue = evalue;
		this.star = star;
	}

	public Star(Integer userId, Integer hotelId, String evalue, Integer star) {
		this.userId = userId;
		this.hotelId = hotelId;
		this.evalue = evalue;
		this.star = star;
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

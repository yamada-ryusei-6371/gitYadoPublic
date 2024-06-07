package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "customers")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String hotelName;
	private Integer price;
	private String address;
	private String information;
	private String hotelTel;
	private Integer hotelRoom;
	private String image;

	public Customer() {
	}

	public Customer(Integer id, String hotelName, Integer price, String address, String information, String hotelTel,
			Integer hotelRoom, String image) {
		this.id = id;
		this.hotelName = hotelName;
		this.price = price;
		this.address = address;
		this.information = information;
		this.hotelTel = hotelTel;
		this.hotelRoom = hotelRoom;
		this.image = image;
	}

	public Customer(String hotelName, Integer price, String address, String information, String hotelTel,
			Integer hotelRoom, String image) {
		this.hotelName = hotelName;
		this.price = price;
		this.address = address;
		this.information = information;
		this.hotelTel = hotelTel;
		this.hotelRoom = hotelRoom;
		this.image = image;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getInformation() {
		return information;
	}

	public void setInformation(String information) {
		this.information = information;
	}

	public String getHotelTel() {
		return hotelTel;
	}

	public void setHotelTel(String hotelTel) {
		this.hotelTel = hotelTel;
	}

	public Integer getHotelRoom() {
		return hotelRoom;
	}

	public void setHotelRoom(Integer hotelRoom) {
		this.hotelRoom = hotelRoom;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

}

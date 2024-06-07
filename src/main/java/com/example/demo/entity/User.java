package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String year;
	private String month;
	private String day;
	private String address;
	private String mail;
	private String tel;
	private String password;
	@Column(name = "account_name")
	private String accountName;
	private Integer point;

	public User() {
	}

	public User(Integer id, String name, String year, String month, String day, String address, String mail, String tel, String password,
			String accountName, Integer point) {
		this.id = id;
		this.name = name;
		this.year = year;
		this.month = month;
		this.day = day;
		this.address = address;
		this.mail = mail;
		this.tel = tel;
		this.password = password;
		this.accountName = accountName;
		this.point = point;
	}

	public User(String name, String year, String month, String day, String address, String mail, String tel, String password,
			String accountName) {
		this.name = name;
		this.year = year;
		this.month = month;
		this.day = day;
		this.address = address;
		this.mail = mail;
		this.tel = tel;
		this.password = password;
		this.accountName = accountName;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public Integer getPoint() {
		return point;
	}

	public void setPoint(Integer point) {
		this.point = point;
	}

}

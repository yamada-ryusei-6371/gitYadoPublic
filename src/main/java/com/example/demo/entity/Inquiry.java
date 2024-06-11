package com.example.demo.entity;

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
	
	public Inquiry(Integer id, String contents, Integer reserveId) {
		this.id = id;
		this.contents = contents;
		this.reserveId = reserveId;
	}
	
	public Inquiry(String contents, Integer reserveId) {
		this.contents = contents;
		this.reserveId = reserveId;
	}
	
	
}

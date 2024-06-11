package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Star;

public interface StarRepository extends JpaRepository<Star, Integer> {
	List<Star> findByHotelId(Integer hotelId);
}

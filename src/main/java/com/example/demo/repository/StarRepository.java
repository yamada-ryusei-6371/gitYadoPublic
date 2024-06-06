package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Star;

public interface StarRepository extends JpaRepository<Star, Integer> {

}

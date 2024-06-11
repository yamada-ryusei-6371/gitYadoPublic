package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	User findAllByMailAndPassword(String mail, String password);

	User findAllByMail(String mail);

	User findAllByTel(String tel);

	User findAllByPassword(String password);

	User findAllByAccountName(String accountName);

	List<User> findAllByMailAndAccountName(String mail, String accountName);

	List<User> findByMail(String mail);

	List<User> findByAccountName(String accountName);

	User findOneById(Integer id);
}

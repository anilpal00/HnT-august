package com.hnt.orderService.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hnt.orderService.entity.User;
import com.hnt.orderService.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository repository;
//	public void save(User user) {
//		repository.save(user);
//		if (user.getName().equals("Ram"))
//			throw new IllegalArgumentException("message");
//		else
//			repository.save(user);
//	}
	
	public User save(User user) {
		if (user.getName().equals("Ram"))
			throw new IllegalArgumentException("message");
		else
			repository.save(user);
		return user;
	}
	
	public Iterable<User> getUser() {
		return repository.findAll();
	}
}

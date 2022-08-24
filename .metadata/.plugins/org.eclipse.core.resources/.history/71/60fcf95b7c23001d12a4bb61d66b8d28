package com.hnt.orderService.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hnt.orderService.entity.User;
import com.hnt.orderService.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	
	public void save(User user) {
		userRepository.save(user);
	}
}

package com.hnt.orderService.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.hnt.orderService.entity.User;
import com.hnt.orderService.service.UserService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/user")
public class UserController extends BaseController {

	@Autowired
	UserService userService;
	
	@GetMapping
	Iterable<User> getUser() {
		return userService.getUser();
	}

	@PostMapping("/age/{age}/height/{height}") // base path
	@ResponseStatus(code = HttpStatus.CREATED)
	ResponseEntity saveUser(@Valid @RequestBody User user, @PathVariable("age") int age, @PathVariable("height") float height) {
		userService.save(user);
		System.out.println(height);
		System.out.println(age);
		//return user.getId();

		MultiValueMap headers = new LinkedMultiValueMap<String, String>();
		headers.add("headerfromserver", "success");
		ResponseEntity responseEntity = new ResponseEntity(headers , HttpStatus.CREATED);
		return responseEntity;
		
	}

	@PostMapping
	Integer saveUser1(@Valid @RequestBody User user) {
		userService.save(user);
		System.out.println("second");
		return user.getId();
	}
}

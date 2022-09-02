package com.hnt.orderService.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

import lombok.Data;

@Entity
@Data
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@NotBlank(message="name cannot be blank")
	private String name;
	
	@Min(value = 1, message = "age cannot be less than 1")
	private int age;
	
	@NotEmpty
	private String dob;
	
	
}

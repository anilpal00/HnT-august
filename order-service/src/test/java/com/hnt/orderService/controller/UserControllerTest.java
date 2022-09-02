package com.hnt.orderService.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.google.inject.Inject;
import com.hnt.orderService.entity.User;
import com.hnt.orderService.service.UserService;

@ExtendWith(MockitoExtension.class)
class UserControllerTest {

	@Mock
	UserService service;
	
	@InjectMocks
	UserController controller;
	
	@Test
	void testSaveUser1() {
		User user = new User();
		user.setId(1);
		user.setName("John");
		when(service.save(user)).thenReturn(user);
		Integer savedUserId = controller.saveUser1(user);
		assertEquals(1, savedUserId);
	}

//	@Test
//	void testSaveUser1() {
//		fail("Not yet implemented");
//	}

}

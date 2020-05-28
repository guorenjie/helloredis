package com.guorenjie.helloredis.service.impl;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.guorenjie.helloredis.entity.User;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
class UserServiceImplTest {

	@Autowired
	private UserServiceImpl UserServiceImpl;
	
	@Test
	void testGetString() {
		String result = (String) UserServiceImpl.getString("test:string");
		log.debug("testGetString===="+result);
	}
	@Test
	void testGetUser() {
		User result = (User) UserServiceImpl.getString("test:user");
		log.debug("testGetString===="+result.toString());
	}

	@Test
	void testSetString() {
		boolean result = UserServiceImpl.setString("test:string", "熊坚强",30000,TimeUnit.MILLISECONDS);
		log.debug("testSetString===="+result);

	}
	@Test
	void testSetUser() {
		User user = new User();
		user.setId("5");
		user.setName("杨瑞");
		boolean result = UserServiceImpl.setString("test:user", user,30000,TimeUnit.MILLISECONDS);
		log.debug("testSetString===="+result);

	}

}

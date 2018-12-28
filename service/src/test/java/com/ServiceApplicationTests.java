package com;

import com.bean.User;
import com.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@SpringBootApplication
public class ServiceApplicationTests {
	@Autowired
	private UserService userService;
	@Test
	public void contextLoads() {
		List<User> users = userService.list();
		System.out.println( users );
	}

}


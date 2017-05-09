package com.emr.util;

import java.util.Arrays;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.emr.datarepository.UserRepository;
import com.emr.security.model.Role;
import com.emr.security.model.User;
import com.emr.service.UserService;

@Component
public class LoadUser {
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	UserService userService;
	
	@PostConstruct
	public void loadUsers() {
		if (userRepository.count() == 0) {
			userService.save(new User("bill", "password", Arrays.asList(new Role("USER"), new Role("ACTUATOR"))));
			userService.save(new User("bob", "password", Arrays.asList(new Role("USER"), new Role("ADMIN"))));
			userService.save(new User("guru", "password", Arrays.asList(new Role("USER"))));
		}
		
	}

}

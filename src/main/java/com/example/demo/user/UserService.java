package com.example.demo.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("userService")
public class UserService {

	@Autowired
	UserRepository userRepository;
	public List<User> getUser() {
		List<User> users= UserRepository.getUsers();
		return users;
		
		
	}
	
	
}

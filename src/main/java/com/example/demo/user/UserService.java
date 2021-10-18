package com.example.demo.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("userService")
public class UserService {

	@Autowired
	UserRepository userRepository;
	
		public List<User> getUser() {
	        return userRepository.findAll();
	    }
	
		public void deleteUser(Integer userId) {
			User user = userRepository.findById(userId);
			userRepository.delete(user);
		}
		public User getUserById(Integer userId) {
			User user = userRepository.findById(userId);
			return user;
			
		}
	
}

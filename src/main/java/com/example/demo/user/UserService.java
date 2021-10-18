package com.example.demo.user;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("userService")
public class UserService {

	@Autowired
	UserRepository userRepository;
	
		public List<User> getUser() {
	        return userRepository.findAll();
	    }
		public User findUserById(int id) {
		    User user = userRepository.findById(id).get();
			return user;
		}
		
	
		public void deleteUser(int userId) {
			userRepository.deleteById(userId);
		}

	
}

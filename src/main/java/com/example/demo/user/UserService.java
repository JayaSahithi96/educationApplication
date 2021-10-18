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
		public Optional<User> findUserById(Integer id) {
		    return userRepository.findById(id);
		}
	
		public void deleteUser(Integer userId) {
			userRepository.deleteById(userId);
		}

	
}

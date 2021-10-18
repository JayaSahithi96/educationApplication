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
		public User findUserById(String id) {
		    User user = userRepository.findById(id).get();
			return user;
		}
		
		public void deleteUserById(String id) {
		    userRepository.deleteById(id);
		}

	
}

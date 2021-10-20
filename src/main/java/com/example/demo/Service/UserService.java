package com.example.demo.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.UserRepository;
import com.example.demo.domain.User;


@EnableMongoRepositories(basePackageClasses = UserRepository.class)
@Configuration
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
		public User addNewUser(User user) {
			userRepository.save(user);
			return user;
		}
	
}

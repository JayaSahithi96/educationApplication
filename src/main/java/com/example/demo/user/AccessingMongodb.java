package com.example.demo.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackageClasses = UserRepository.class)
@Configuration
public class AccessingMongodb {
	@Autowired
	 @Bean
	    CommandLineRunner commandLineRunner(UserRepository userRepository) {
	        return strings -> {
	            userRepository.save(new User("1","Sahithi", "Student", "Jaya", "Aravapalli", "jsahithi@gmail.com", "916507"));
	            userRepository.save(new User("2", "Srinivas", "Instructor", "Srini", "Nandigam", "raonandigam@gmail.com", "510"));
	            userRepository.save(new User("3", "Usha", "Student", "Usha Rani", "Aravapalli", "Usha@gmail.com", "8885677733"));
	        };
	    }
	
}

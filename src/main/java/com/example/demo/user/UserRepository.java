package com.example.demo.user;


import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;


public interface UserRepository extends MongoRepository<User, Integer>{
    
	 public List<User> getUsers();
	  public List<User> findByLastName(String lastName);
	
	
	
}
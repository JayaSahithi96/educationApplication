package com.example.demo.user;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
        @Autowired
	 UserService userService;
	

	
	@GetMapping("/students")
	public List<User> getUsers() {
	    return userService.getUser();
	}
	
    
     
	


}

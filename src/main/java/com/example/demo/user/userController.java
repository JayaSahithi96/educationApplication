package com.example.demo.user;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
public class userController {
        @Autowire
	private final UserService userService;
	

	
	@GetMapping("/students")
	public List<user> getUsers() {
	    return userService.getUsers();
	}
	


}

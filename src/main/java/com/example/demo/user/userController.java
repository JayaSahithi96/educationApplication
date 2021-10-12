package com.example.demo.user;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class userController {
	private final userRepository studentRepository = null;
	

	
	@GetMapping("/students")
	public List<user> getUsers() {
	    return studentRepository.findAll();
	}
	


}

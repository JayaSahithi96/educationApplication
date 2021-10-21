package com.example.demo.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.SubjectRepository;
import com.example.demo.Repository.UserRepository;
import com.example.demo.domain.User;

@Service
public class EnrollService {

	@Autowired
	SubjectRepository subjectRepository;
	
	@Autowired
	UserRepository userRepository;
	
	public List<User> getStudentsToEnroll(String subjectId){
		
		List<User> userList = new ArrayList<>();
		List<User> users = userRepository.findStudentsToEnroll(subjectId);
		
	}
	
}

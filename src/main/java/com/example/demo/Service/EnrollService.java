package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.SubjectRepository;
import com.example.demo.Repository.UserRepository;

@Service
public class EnrollService {

	@Autowired
	SubjectRepository subjectRepository;
	
	@Autowired
	UserRepository userRepository;
	
	
}

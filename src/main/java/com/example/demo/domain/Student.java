package com.example.demo.domain;



import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data

@Document
public class Student extends User{
	
public Student(String id, String userName, String userType, String firstName, String lastName, String emailId,
			String telephone) {
		super(id, userName, userType, firstName, lastName, emailId, telephone);
		// TODO Auto-generated constructor stub
	}

private String GPA;



}

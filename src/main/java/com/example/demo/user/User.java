package com.example.demo.user;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@Document
public class User {
	
	 @Id
	 private int Id;

	 private String userName;


	 private String userType;

	 private String firstName;

	 private String lastName;

	 private String emailId;

	 private String telephone;

}

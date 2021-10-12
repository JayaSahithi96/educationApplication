package com.example.demo.user;
import lombok.Data;


import javax.persistence.GeneratedValue;

@Data
public class user {
	@GeneratedValue
	 private Long Id;

	 private String userName;


	 private String userType;

	 private String firstName;

	 private String lastName;

	 private String emailId;

	 private String telephone;

}

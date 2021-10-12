package com.example.demo.user;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
@Data
public class user {
	@Id
	@GeneratedValue
	 private int Id;

	 private String userName;


	 private String userType;

	 private String firstName;

	 private String lastName;

	 private String emailId;

	 private String telephone;

}

package com.example.demo.domain;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
@SuperBuilder
@Entity
public class User {
	
	 @Id
	 private String id;

	 private String userName;


	 private String userType;

	 private String firstName;

	 private String lastName;

	 private String emailId;

	 private String telephone;

}

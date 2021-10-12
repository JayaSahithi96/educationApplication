package com.example.demo.user;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.GeneratedValue;

@NoArgsConstructor
@AllArgsConstructor
@ToString
public class user {
	@GeneratedValue
	@Getter @Setter private Long Id;

	@Getter @Setter private String userName;


	@Getter @Setter private String userType;

	@Getter @Setter private String firstName;

	@Getter @Setter private String lastName;

	@Getter @Setter private String emailId;

	@Getter @Setter private String telephone;

}

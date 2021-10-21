package com.example.demo.domain;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Document
public class Address {

	private String streetAddress;
    private String city;
    private String state;
    private String zipCode;
	
}

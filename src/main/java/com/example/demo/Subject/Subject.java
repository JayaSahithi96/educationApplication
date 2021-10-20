package com.example.demo.Subject;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Document
public class Subject {
	
	private String id;

	private String title;

	private String description;

	private String subjectTerm;

	private String subjectType;

	private String subjectId;

}
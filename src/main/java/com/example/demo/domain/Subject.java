package com.example.demo.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Document
public class Subject {
	@Id
	private String subjectId;

	private String title;


	private String subjectTerm;

	private String subjectType;

	

}

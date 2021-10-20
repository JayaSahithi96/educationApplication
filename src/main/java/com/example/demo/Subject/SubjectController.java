package com.example.demo.Subject;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

public class SubjectController {

	 @Autowired
	 SubjectService subjectService;
	

	
	@GetMapping("/subjects")
	public List<Subject> getSubjects() {
	    return subjectService.getSubject();
	}
}

package com.example.demo.Subject;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SubjectController {

	 @Autowired
	 SubjectService subjectService;
	

	
	@GetMapping("/subjects")
	public List<Subject> getSubjects() {
	    return subjectService.getSubject();
	}
	
	@PostMapping("/subject")
    public Subject addNew(@RequestBody Subject subject) {
	return subjectService.addNewSubject(subject);
}

}

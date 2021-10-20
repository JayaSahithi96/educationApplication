package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.SubjectService;
import com.example.demo.domain.Subject;

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

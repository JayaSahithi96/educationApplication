package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@DeleteMapping("/subject")
	public ResponseEntity deleteSubject(
	        @PathVariable("subjectId") String subjectId) {
	    subjectService.deleteSubjectById(subjectId);
	    return new ResponseEntity(HttpStatus.OK);
	}
	
	@GetMapping("/subject/{id}")
    public ResponseEntity<Subject> getSubjectById(@PathVariable("subjectId") String subjectId) {
		Subject subject= subjectService.findSubjectById(subjectId);
		if (subject == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<>(subject, HttpStatus.OK);
        }
}
}
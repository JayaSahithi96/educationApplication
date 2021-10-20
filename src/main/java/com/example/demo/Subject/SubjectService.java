package com.example.demo.Subject;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("subjectService")
public class SubjectService {
	@Autowired
	SubjectRepository subjectRepository;
	
	public List<Subject> getSubject() {
        return subjectRepository.findAll();
    }
	

}

package com.example.demo.Subject;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Service;

@EnableMongoRepositories(basePackageClasses = SubjectRepository.class)
@Configuration
@Service("subjectService")
public class SubjectService {
	@Autowired
	SubjectRepository subjectRepository;
	
	public List<Subject> getSubject() {
        return subjectRepository.findAll();
    }
	public Subject addNewSubject(Subject subject) {
		subjectRepository.save(subject);
		return subject;
	}

}

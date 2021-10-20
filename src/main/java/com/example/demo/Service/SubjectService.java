package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.SubjectRepository;
import com.example.demo.domain.Subject;

@EnableMongoRepositories
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

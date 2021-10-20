package com.example.demo.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.Subject;

@Repository
public interface SubjectRepository extends MongoRepository<Subject, String> {
	
}

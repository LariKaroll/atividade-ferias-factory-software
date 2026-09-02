package com.example.crud.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.crud.model.Professor;

public interface ProfessorRepository extends MongoRepository<Professor, String>{
    
}

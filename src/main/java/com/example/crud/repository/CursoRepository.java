package com.example.crud.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.crud.model.Curso;

public interface CursoRepository extends MongoRepository<Curso, String>{
    
}

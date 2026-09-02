package com.example.crud.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.crud.model.Turma;

public interface TurmaRepository extends MongoRepository<Turma, String>{
    
}

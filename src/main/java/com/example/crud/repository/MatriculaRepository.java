package com.example.crud.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.crud.model.Matricula;

/**
 * MatriculaRepository
 */
public interface MatriculaRepository extends MongoRepository<Matricula, String>{

    
}
package com.example.crud.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.crud.model.Disciplina;

public interface DisciplinaRepository extends MongoRepository<Disciplina, Long> {
}

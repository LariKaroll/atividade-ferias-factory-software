package com.example.crud.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.crud.model.Pessoa;

public interface PessoaRepository extends MongoRepository<Pessoa, String> {
}
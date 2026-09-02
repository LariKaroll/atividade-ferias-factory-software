package com.example.crud.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.crud.model.Avaliacao;

public interface AvaliacaoRepository extends MongoRepository<Avaliacao, String> {
}
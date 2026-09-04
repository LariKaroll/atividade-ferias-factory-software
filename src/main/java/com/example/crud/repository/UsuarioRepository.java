package com.example.crud.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.crud.model.Usuario;

public interface UsuarioRepository extends MongoRepository<Usuario, String>{
    Optional<Usuario> findByUsername(String username);
}

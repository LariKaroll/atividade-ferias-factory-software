package com.example.crud.service;

import org.springframework.stereotype.Service;

import com.example.crud.config.PasswordEncoderConfig;
import com.example.crud.repository.UsuarioRepository;

@Service
public class UsuarioService {
    private final UsuarioRepository repository;
    private final PasswordEncoderConfig passwordEncoder;

    public UsuarioService(UsuarioRepository repository, PasswordEncoderConfig passwordEncoder) {
        this.repository = repository;
        this.passwordEncoder = passwordEncoder;
    }

    
    


}

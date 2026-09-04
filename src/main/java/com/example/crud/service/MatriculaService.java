package com.example.crud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.crud.model.Matricula;
import com.example.crud.repository.MatriculaRepository;

@Service
public class MatriculaService {
    private final MatriculaRepository repository;

    public MatriculaService(MatriculaRepository repository) {
        this.repository = repository;
    }

    public List<Matricula> listarTudo() {
        return repository.findAll();
    }

    public Optional<Matricula> listarById(String id) {
        return repository.findById(id);
    }

    public Matricula save(Matricula matricula) {
        return repository.save(matricula);
    }

    public void deleteById(String id) {
        repository.deleteById(id);
    }
}

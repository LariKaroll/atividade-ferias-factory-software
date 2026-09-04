package com.example.crud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.crud.model.Professor;
import com.example.crud.repository.ProfessorRepository;

@Service
public class ProfessorService {
    private final ProfessorRepository repository;

    public ProfessorService(ProfessorRepository repository) {
        this.repository = repository;
    }

    public List<Professor> listaTudo() {
        return repository.findAll();
    }

    public Optional<Professor> listarById(String id) {
        return repository.findById(id);
    }

    public Professor save(Professor professor) {
        return repository.save(professor);
    }

    public void deleteById(String id) {
        repository.deleteById(id);
    }
}

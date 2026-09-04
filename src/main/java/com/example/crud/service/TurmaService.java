package com.example.crud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.crud.model.Turma;
import com.example.crud.repository.TurmaRepository;

@Service
public class TurmaService {
    private final TurmaRepository repository;

    public TurmaService(TurmaRepository repository) {
        this.repository = repository;
    }

    public List<Turma> listaTudo() {
        return repository.findAll();
    }
    
    public Optional<Turma> listarById(String id) {
        return repository.findById(id);
    }

    public Turma save(Turma turma) {
        return repository.save(turma);
    }

    public void deleteById(String id) {
        repository.deleteById(id);
    }
}

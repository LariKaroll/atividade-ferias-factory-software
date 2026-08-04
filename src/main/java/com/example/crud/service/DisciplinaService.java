package com.example.crud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.crud.model.Disciplina;
import com.example.crud.repository.DisciplinaRepository;

@Service
public class DisciplinaService {
    private final DisciplinaRepository repository;

    public DisciplinaService(DisciplinaRepository repository) {
        this.repository = repository;
    }

    public List<Disciplina> listarTodas(){
        return repository.findAll();
    }

    public Optional<Disciplina> listarById(Long id) {
        return repository.findById(id);
    }

    public Disciplina salvarDisciplina(Disciplina disciplina){
        return repository.save(disciplina);
    }

    public void excluirDisciplina(Long id) {
        repository.deleteById(id);
    }
}

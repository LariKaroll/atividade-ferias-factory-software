package com.example.crud.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.crud.model.Curso;
import com.example.crud.repository.CursoRepository;

@Service
public class CursoService {
    private final CursoRepository repository;

    public CursoService(CursoRepository repository) {
        this.repository = repository;
    }
    
    public List<Curso> listarTudo() {
        return repository.findAll();
    }

    public Curso save(Curso c) {
        return repository.save(c);
    }

    public Curso atualizar(@PathVariable String id, Curso novoCurso) {
        return repository.findById(id).map(c -> {
            c.setNome(novoCurso.getNome());
            c.setCargaHoraria(novoCurso.getCargaHoraria());
            c.setAtivo(novoCurso.isAtivo());
            return repository.save(c);
        }).orElseThrow(() -> new RuntimeException("Curso não encontrado"));
    }

    public void deleteById(String id){
        repository.deleteById(id);
    }
}

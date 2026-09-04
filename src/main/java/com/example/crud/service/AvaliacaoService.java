package com.example.crud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.crud.model.Avaliacao;
import com.example.crud.repository.AvaliacaoRepository;

@Service
public class AvaliacaoService {
    private final AvaliacaoRepository repository;

    public AvaliacaoService(AvaliacaoRepository repository) {
        this.repository = repository;
    }

    public List<Avaliacao> listarTudo(){
        return repository.findAll();
    }

    private Optional<Avaliacao> findById(String id) {
        return repository.findById(id);
    }

    private Avaliacao save(Avaliacao a){
        return repository.save(a);
    }

    private void deleteById(String id) {
        repository.deleteById(id);
    }
}

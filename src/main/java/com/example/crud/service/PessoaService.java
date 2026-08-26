package com.example.crud.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.crud.model.Pessoa;
import com.example.crud.repository.PessoaRepository;

@Service
public class PessoaService {
    private final PessoaRepository repository;

    public PessoaService(PessoaRepository repository) {
        this.repository = repository;
    }

    public List<Pessoa> listarTodas() {
        return repository.findAll();
    }

    public Pessoa salvarPessoa(Pessoa pessoa) {
        return repository.save(pessoa);
    }

    public Pessoa atualizarPessoa(@PathVariable String id, Pessoa novaPessoa) {
        return repository.findById(id).map(p -> {
            p.setNome(novaPessoa.getNome());
            p.setIdade(novaPessoa.getIdade());
            p.setEmail(novaPessoa.getEmail());
            p.setAtivo(novaPessoa.isAtivo());
            return repository.save(p);
        }).orElseThrow(() -> new RuntimeException("Pessoa nao encontrada"));
    }

    public void excluirPessoa(String id) {
        repository.deleteById(id);
    }
}

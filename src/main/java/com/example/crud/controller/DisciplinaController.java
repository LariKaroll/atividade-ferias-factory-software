package com.example.crud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.crud.model.Disciplina;
import com.example.crud.service.DisciplinaService;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;




@RestController
@RequestMapping("/disciplinas")
public class DisciplinaController {
    
    private final DisciplinaService service;

    public DisciplinaController(DisciplinaService service) {
        this.service = service;
    }

    @GetMapping
    public List<Disciplina> listarDisciplinas() {
        return service.listarTodas();
    }

    @GetMapping("/{id}")
    public Optional<Disciplina> listarById(@RequestParam Long id) {
        return service.listarById(id);
    }
    
    @PostMapping
    public Disciplina create(@RequestBody Disciplina disciplina) {
        return service.salvarDisciplina(disciplina);
    }

    @PutMapping("/{id}")
    public Disciplina update(@PathVariable String id, @RequestBody Disciplina disciplina) {
        disciplina.setId(id);
        return service.salvarDisciplina(disciplina);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.excluirDisciplina(id);
    }
}

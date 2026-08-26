package com.example.crud.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "turma")
public class Turma {
    @Id
    private String id;
    private String nome;
    private int ano;
    private boolean ativo;
}

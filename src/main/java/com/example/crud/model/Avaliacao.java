package com.example.crud.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "avaliacao")
public class Avaliacao {
    @Id
    private String id;
    private String pessoaId;
    private String disciplinaId;
    private double nota;
    private String data;
    private boolean ativo;
}

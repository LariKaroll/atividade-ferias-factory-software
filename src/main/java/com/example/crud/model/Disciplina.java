package com.example.crud.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "disciplina")
public class Disciplina {
    @Id
    private String id;

    private String nome;
    private boolean ativo;

}

package com.example.crud.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "professor")
public class Professor {
    @Id
    private String id;
    private String nome;
    private int idade;
    private String email;
    private String area;
    private boolean ativo;
}

package com.example.crud.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "matricula")
public class Matricula {
    @Id
    private String id;
    private String pessoaId;
    private String cursoId;
    private String dataMatricula;
    private boolean ativo;
}

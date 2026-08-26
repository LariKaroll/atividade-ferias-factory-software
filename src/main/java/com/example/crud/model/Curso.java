package com.example.crud.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "cursos")
public class Curso {
    @Id
    private String id;
    private String nome;
    private int cargaHoraria;
    private boolean ativo;
}

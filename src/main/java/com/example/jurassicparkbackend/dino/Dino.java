package com.example.jurassicparkbackend.dino;

import jakarta.persistence.*;

@Table(name = "dinos")
@Entity(name = "dinos")
public class Dino {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String periodo;
    private String cor;
    private String dieta;
    private Integer peso;
    private Integer tamanho;
    private Integer comprimento;
    private String descricao;
    private String image;
}

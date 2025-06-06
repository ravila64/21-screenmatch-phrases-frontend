package com.aluracursos.screenmatch_phrases.model;

import jakarta.persistence.*;

@Entity
@Table(name="frases")
public class Frase {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
   private String titulo;
   private String frase;
   private String personaje;
}

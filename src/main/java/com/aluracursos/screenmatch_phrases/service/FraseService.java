package com.aluracursos.screenmatch_phrases.service;

import com.aluracursos.screenmatch_phrases.dto.FraseDTO;
import com.aluracursos.screenmatch_phrases.model.Frase;
import com.aluracursos.screenmatch_phrases.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FraseService {

   @Autowired
   private FraseRepository repository;

   public FraseDTO obtenerFraseAleatoria() {
      Frase fr = repository.obtenerFraseAleatoria();
      return new FraseDTO(fr.getTitulo(), fr.getFrase(), fr.getPersonaje(), fr.getPoster());
   }
}

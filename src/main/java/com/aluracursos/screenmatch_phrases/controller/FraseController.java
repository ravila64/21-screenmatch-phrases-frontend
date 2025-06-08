package com.aluracursos.screenmatch_phrases.controller;

import com.aluracursos.screenmatch_phrases.dto.FraseDTO;
import com.aluracursos.screenmatch_phrases.service.FraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class FraseController {
   @Autowired
   private FraseService service;

   @GetMapping("/series/frases")
   public FraseDTO obtenerFraseAleatoria() {
      return service.obtenerFraseAleatoria();
   }
}

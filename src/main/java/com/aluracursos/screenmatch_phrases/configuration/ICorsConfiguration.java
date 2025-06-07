package com.aluracursos.screenmatch_phrases.configuration;

import org.springframework.web.servlet.config.annotation.CorsRegistry;

public interface ICorsConfiguration {
   public void addCorsMapping(CorsRegistry registry);
}

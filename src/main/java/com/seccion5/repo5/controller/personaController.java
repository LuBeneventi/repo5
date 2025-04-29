package com.seccion5.repo5.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("/api/personas")
public class personaController {

    @GetMapping
    public String saludar() {
        return "Hola el microservicio funciona";
    }
    
}

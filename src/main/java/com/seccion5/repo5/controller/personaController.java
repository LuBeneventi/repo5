package com.seccion5.repo5.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.seccion5.repo5.model.persona;
import com.seccion5.repo5.service.personaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/api/personas")
public class personaController {

    @Autowired
    private personaService personaService;

    @GetMapping
    public String saludar() {
        return "Hola el microservicio funciona";
    }
    
    @PostMapping 
    public persona agregar(@RequestBody persona p)
    {
        return personaService.guardarPersona(p);
    }
}

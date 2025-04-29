package com.seccion5.repo5.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seccion5.repo5.model.persona;
import com.seccion5.repo5.repository.PersonaRepository;

@Service
public class personaService {
    @Autowired
    private PersonaRepository personaRepository;

    public persona guardarPersona(persona p)
    {
        return personaRepository.create(p);
    }
}

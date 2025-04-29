package com.seccion5.repo5.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.seccion5.repo5.model.persona;

@Repository

public class PersonaRepository {
    private List<persona> personas = new ArrayList<>();

    public persona create(persona p){
        personas.add(p);
        System.out.println(personas.toString());
        return p;
    }
}

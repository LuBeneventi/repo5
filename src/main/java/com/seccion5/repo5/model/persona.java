package com.seccion5.repo5.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class persona {
    private int id;
    private String rut;
    private String nombre;
    private String apellido;
    private int edad;
}

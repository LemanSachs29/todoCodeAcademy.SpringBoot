package com.todocodeacademy.apirest.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Jugador {

    private Long id;
    private String dni;
    private String nombre;
    private String apellido;
    private int edad;
    private float peso;
    private float estatura;
}

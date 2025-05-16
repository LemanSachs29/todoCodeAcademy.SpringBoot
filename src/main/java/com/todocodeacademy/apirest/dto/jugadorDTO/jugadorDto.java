package com.todocodeacademy.apirest.dto.jugadorDTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class jugadorDto {

    private Long id;
    private String dni;
    private String nombre;
    private String apellido;
    private int edad;
    private float peso;
    private float estatura;
}

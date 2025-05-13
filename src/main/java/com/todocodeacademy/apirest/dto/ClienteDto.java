package com.todocodeacademy.apirest.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
public class ClienteDto {
    private Long id;
    private String nombre;
    private String apellido;
}

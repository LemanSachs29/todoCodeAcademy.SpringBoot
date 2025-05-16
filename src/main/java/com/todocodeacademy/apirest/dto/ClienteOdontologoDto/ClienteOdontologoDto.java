package com.todocodeacademy.apirest.dto.ClienteOdontologoDto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter 
@Setter 
@AllArgsConstructor
public class ClienteOdontologoDto {

    private String nombre;
    private String apellido;
    private String sexo;
    private LocalDate fechaNac;

    

}

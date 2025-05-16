package com.todocodeacademy.apirest.service.IPersonaService;

import java.util.List;

import com.todocodeacademy.apirest.model.Persona;

public interface IPersonaService {


    public void crearPersona (Persona persona);
    public List<Persona> devolverPersonas ();
}

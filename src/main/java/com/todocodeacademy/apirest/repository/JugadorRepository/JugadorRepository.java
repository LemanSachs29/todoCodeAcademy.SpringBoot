package com.todocodeacademy.apirest.repository.JugadorRepository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.todocodeacademy.apirest.model.Jugador;

@Repository
public class JugadorRepository {

    public void crearJugadores(List<Jugador> listaJugadores){
        for (Jugador jugador:listaJugadores){
            System.out.println(
                
            "Id: " + jugador.getId() + 
            " Dni: " + jugador.getDni() + 
            " Nombre: " + jugador.getNombre() + 
            " " + jugador.getApellido() + 
            " Edad: " + jugador.getEdad() + 
            " Peso: " + jugador.getPeso() + 
            " Estatura: " + jugador.getEstatura());
        }
    }
}

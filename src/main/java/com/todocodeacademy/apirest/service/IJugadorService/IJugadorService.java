package com.todocodeacademy.apirest.service.IJugadorService;

import java.util.List;

import com.todocodeacademy.apirest.model.Jugador;

public interface IJugadorService {

    public void accionCrear(List<Jugador> ListaJugadores); //Este método inserta en la base de datos

    public float acciónMediaEstatura(List<Jugador> ListaJugadores); //Este método devuelve la media de un equipo de jugadores
}

package com.todocodeacademy.apirest.service.JugadorService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todocodeacademy.apirest.model.Jugador;
import com.todocodeacademy.apirest.repository.JugadorRepository.JugadorRepository;
import com.todocodeacademy.apirest.service.IJugadorService.IJugadorService;

@Service
public class JugadorService implements IJugadorService {

   @Autowired
    JugadorRepository repository;

    @Override
    public void accionCrear(List<Jugador> ListaJugadores) {

        //Llamamos al repository y le pasamos la lista de jugadores para que la inserte
        repository.crearJugadores(ListaJugadores);
    }

    @Override
    public float acciónMediaEstatura(List<Jugador> ListaJugadores) {
        // Recorremos la lista de jugadores para calcular la media:
        float mediaAltura = 0;
        for (Jugador jugador: ListaJugadores){
            mediaAltura += jugador.getEstatura();
        }

        mediaAltura = (float) mediaAltura/ListaJugadores.size();
        return mediaAltura;
    }


}

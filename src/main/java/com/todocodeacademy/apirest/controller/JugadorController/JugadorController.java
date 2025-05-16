package com.todocodeacademy.apirest.controller.JugadorController;

import org.springframework.web.bind.annotation.RestController;

import com.todocodeacademy.apirest.model.Jugador;
import com.todocodeacademy.apirest.service.JugadorService.JugadorService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class JugadorController {

    @Autowired
    JugadorService service;

 /**
 * Ejercicio Nº 2 – Estaturas en Basquet
 *
 * Un director técnico de un equipo de basquet desea poder
 * contar con una API que, al enviar los datos de 5 de sus
 * jugadores en el body de una solicitud http POST, los
 * mismos sean dados de alta en una base de datos lógica
 * representada por una lista de tipo ArrayList y que, al
 * mismo tiempo, luego del alta correspondiente, se pueda
 * obtener inmediatamente como respuesta el promedio de
 * estatura de todos sus jugadores ingresados.
 *
 * Los datos que se ingresan para cada jugador son los
 * siguientes: id, dni, nombre, apellido, edad, peso y
 * estatura.
 *
 * Tener en cuenta para la realización de este ejercicio la
 * manipulación/creación de archivos JSON, el uso de Postman
 * como herramienta para generar la solicitud POST, la
 * annotation @RequestBody y el manejo de ArrayLists.
 */

@PostMapping("/jugadores")
public float postMethodName(@RequestBody List<Jugador> jugadores) {
    
    //Llamamos al método que almacena los jugadores en la base de datos
    service.accionCrear(jugadores);

    float alturaMedia = service.acciónMediaEstatura(jugadores);
       
    return alturaMedia;
}


}

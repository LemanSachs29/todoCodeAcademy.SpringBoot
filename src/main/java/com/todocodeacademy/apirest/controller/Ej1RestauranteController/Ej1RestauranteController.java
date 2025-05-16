package com.todocodeacademy.apirest.controller.Ej1RestauranteController;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import com.todocodeacademy.apirest.dto.PlatoDto.PlatoDto;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
public class Ej1RestauranteController {

/**
 * Un restaurante posee un total de 5 platos en su menú.  
 * Cada uno de ellos tiene un número de plato, nombre, 
 * precio y breve descripción.
 *
 * a. El restaurante desea una aplicación que permita que 
 * los clientes sean capaces consultar los datos de los 
 * platos del menú a partir de proporcionar el número de 
 * plato. Para ello, se necesita el desarrollo de una API 
 * que a partir de la recepción del num de plato en una 
 * solicitud GET, devuelva el plato correspondiente con 
 * todos sus datos.
 */

 @GetMapping("plato/{numPlato}") 
 public PlatoDto mostrarPlato(@PathVariable int numPlato){

    List<PlatoDto> platos = new ArrayList<>();

        platos.add(new PlatoDto(1, "Pizza Margherita", "Tomate, mozzarella, albahaca"));
        platos.add(new PlatoDto(2, "Pizza Pepperoni", "Salsa de tomate, mozzarella, pepperoni"));
        platos.add(new PlatoDto(3, "Pizza Cuatro Quesos", "Mozzarella, gorgonzola, parmesano, ricotta"));
        platos.add(new PlatoDto(4, "Pizza Hawaiana", "Salsa de tomate, jamón, piña, mozzarella"));
        platos.add(new PlatoDto(5, "Pizza Vegetariana", "Tomate, pimientos, champiñones, cebolla, aceitunas"));



        return platos.get(numPlato -1);
 }

}

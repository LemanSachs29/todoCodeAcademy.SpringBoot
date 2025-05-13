package com.todocodeacademy.apirest.controller.Ej1Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class Ej1Controller {

    /**Un profesor de matemáticas de primaria desea la realización de una Api mediante
     * la cual a partir de la recepción de dos números como parámetros de una URL, la
     * misma devuelva la suma de ambos números por pantalla. 
     * Utiliza para este ejercicio la annotation @PathVariable
     */


     @GetMapping("/suma/{num1}/{num2}")
     public String suma(@PathVariable float num1, 
                               @PathVariable float num2) {
         float resultado = (float) num1 + num2;
         return num1 + " + " + num2 + " = " + resultado;
     }

     
}

package com.todocodeacademy.apirest.controller.Ej2Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ej2Controller {


    /**Una nutricionista desea la realización de una API que a partir del ingreso del 
     * IMC (índice de masa corporal) de una persona en el parámetro de la URL, le devuelva 
     * el estado de su peso. Para ello tener en cuenta los siguientes rangos:
     * de 1 a 18.5: Peso insuficiente
     * de 18.6 a 24.9: Peso normal
     * de 25.0 a 29.9: Sobrepeso
     * de 30 en adelante: Obesidad
     * Tener en cuenta para la realización de este ejercicio la annotation @RequestParam. */


     @GetMapping("/imc")
    public String estadoIMC(@RequestParam float imc) {
        String msg;

        if (imc < 1) {
        msg = "IMC inválido";
        } else if (imc <= 18.5) {
            msg = "Peso insuficiente";
        } else if (imc <= 24.9) {
            msg = "Peso normal";
        } else if (imc <= 29.9) {
            msg = "Sobrepeso";
        } else {
            msg = "Obesidad";
        }

        return "Tu estado de peso es: " + msg;
    }
}

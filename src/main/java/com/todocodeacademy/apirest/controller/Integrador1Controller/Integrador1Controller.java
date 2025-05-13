package com.todocodeacademy.apirest.controller.Integrador1Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Integrador1Controller {


    /** Un turista norteamericano decidió recorrer en auto diferentes países de América Latina.
     *  A la hora de cargar combustible, para su sorpresa, se encontró con que en la mayor parte
     *  de los países no se utiliza la medida “galones” sino que se utiliza “litros”
     *  a la hora de reabastecerse.
     * 
     * Para poder solicitar correctamente la cantidad de litros que necesita, requiere el 
     * desarrollo de una API que, al enviarle la cantidad de galones otorgue como respuesta
     *  el equivalente en litros.
     * 
     * Para el desarrollo tener en cuenta que: 1 galón es equivalente a 3,78541 litros.*/

     @GetMapping("/convertirGalones")
    public String convertirGalones(@RequestParam float galones) {
        final float LITROS_POR_GALON = 3.78541f;
        float litros = galones * LITROS_POR_GALON;

        return galones + " galones equivalen a " + litros + " litros.";
    }
}

package com.todocodeacademy.apirest.controller.ClienteController;

import org.springframework.web.bind.annotation.RestController;

import com.todocodeacademy.apirest.dto.ClienteDto;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;





@RestController
public class ClienteController {

    @PostMapping("/cliente")
    public void nuevoCliente(@RequestBody ClienteDto cli) {
        //probamos que nos devuelva por consola del servidor
        //los parámetros que recibimos desde el cliente mediante el body de la solicitud
        
        System.out.println("Datos del cliente. Nombre: " + cli.getNombre() 
        + " Apellido: " + cli.getApellido());
    }
    

    @GetMapping("/cliente/traer")
    @ResponseBody
    public List <ClienteDto> traerClientes() {
        
        List <ClienteDto> listaClientes = new ArrayList<ClienteDto>();
        listaClientes.add(new ClienteDto(1L, "Cristiano", "Ronaldo"));
        listaClientes.add(new ClienteDto(1L, "Lionel", "Messi"));
        listaClientes.add(new ClienteDto(1L, "Antoine", "Griezmann"));

        return listaClientes;
    }

    @GetMapping("/pruebaResponse")
    ResponseEntity<String> traerRespuesta() {

        return new ResponseEntity<>("Esto es un mensaje Response Entity", HttpStatus.OK);
    }
        
}

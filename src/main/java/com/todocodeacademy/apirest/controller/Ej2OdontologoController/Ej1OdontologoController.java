package com.todocodeacademy.apirest.controller.Ej2OdontologoController;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.todocodeacademy.apirest.dto.ClienteOdontologoDto.ClienteOdontologoDto;


@RestController
public class Ej1OdontologoController {


 /**
 * Un odontólogo cuenta con una lista de pacientes.  
 * De cada uno de ellos cuenta con los datos: id, dni, 
 * nombre, apellido y fecha de nacimiento.
 *
 * a. El odontólogo necesita de una API que sea capaz de 
 * brindarle el listado completo de sus pacientes. Para 
 * esto, desarrollar un end-point que permita devolver la 
 * lista completa de pacientes mediante el método GET.
 *
 * b. Además, el odontólogo necesita saber sus pacientes 
 * que son menores de edad para contemplar que los mismos 
 * asistan a sus citas acompañados por un mayor. Para ello, 
 * necesita que la API posea un end-point que al realizar 
 * la solicitud GET, devuelva únicamente a los pacientes 
 * que sean menores de edad. *Para realizar el cálculo de 
 * edad tener en cuenta la fecha de nacimiento de cada 
 * paciente y la fecha «actual» (día en que se esté 
 * haciendo la consulta)*.
 */



    

    @GetMapping("/devolverClientes")
    public List<ClienteOdontologoDto> devolverClientes(){
            List<ClienteOdontologoDto> clientes = new ArrayList<>();

    clientes.add(new ClienteOdontologoDto("Martina", "López", "Femenino", LocalDate.of(2010, 6, 15)));
    clientes.add(new ClienteOdontologoDto("Carlos", "Pérez", "Masculino", LocalDate.of(1985, 3, 22)));
    clientes.add(new ClienteOdontologoDto("Lucía", "Ramírez", "Femenino", LocalDate.of(2008, 12, 9)));
    clientes.add(new ClienteOdontologoDto("Andrés", "Sosa", "Masculino", LocalDate.of(1990, 8, 3)));
    clientes.add(new ClienteOdontologoDto("Valentina", "Gómez", "Femenino", LocalDate.of(2012, 2, 27)));
    clientes.add(new ClienteOdontologoDto("Santiago", "Martínez", "Masculino", LocalDate.of(1978, 11, 30)));

    return clientes;
    }


    @GetMapping("/devolverClientes/menores")
    public List<ClienteOdontologoDto> devolverClientesMenores(){
            List<ClienteOdontologoDto> clientes = new ArrayList<>();

    clientes.add(new ClienteOdontologoDto("Martina", "López", "Femenino", LocalDate.of(2010, 6, 15)));
    clientes.add(new ClienteOdontologoDto("Carlos", "Pérez", "Masculino", LocalDate.of(1985, 3, 22)));
    clientes.add(new ClienteOdontologoDto("Lucía", "Ramírez", "Femenino", LocalDate.of(2008, 12, 9)));
    clientes.add(new ClienteOdontologoDto("Andrés", "Sosa", "Masculino", LocalDate.of(1990, 8, 3)));
    clientes.add(new ClienteOdontologoDto("Valentina", "Gómez", "Femenino", LocalDate.of(2012, 2, 27)));
    clientes.add(new ClienteOdontologoDto("Santiago", "Martínez", "Masculino", LocalDate.of(1978, 11, 30)));

            List<ClienteOdontologoDto> cliMenores = new ArrayList<>();


            for(ClienteOdontologoDto cliente:clientes){
                if(Period.between(cliente.getFechaNac(), LocalDate.now()).getYears() < 18){
                    cliMenores.add(cliente);
                }
            }

            return cliMenores;
    }

}

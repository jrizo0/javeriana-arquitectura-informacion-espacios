package co.edu.javeriana.as.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("edificios")
public class EdificiosController {
    //todo: implementar CRUD
    @GetMapping("hola")
    public String hola(){
        return "hola";
    }
}

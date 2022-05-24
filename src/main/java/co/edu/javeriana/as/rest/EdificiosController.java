package co.edu.javeriana.as.rest;

import co.edu.javeriana.as.services.EdificiosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("edificios")
public class EdificiosController {
    @Autowired
    private EdificiosService edificiosService;

    @GetMapping("/get")
    public ResponseEntity<String> getEdificios() {
        return new ResponseEntity<>(edificiosService.getEdificios().toString(), new HttpHeaders(), HttpStatus.OK);
    }

    @GetMapping("/get/{idEdificio}")
    public ResponseEntity<String> getEdificio(@PathVariable int idEdificio) {
        try {
            return new ResponseEntity<>(edificiosService.getEdificio(idEdificio).toString(), new HttpHeaders(), HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(e.getMessage(), new HttpHeaders(), HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping("/add/{numero}/{nombre}")
    public ResponseEntity<String> addEdificio(@PathVariable int numero, @PathVariable String nombre){
        try{
            return new ResponseEntity<>(edificiosService.addEdificio(numero, nombre).toString(), new HttpHeaders(), HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(e.getMessage(), new HttpHeaders(), HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping("/update/{id}/{numero}/{nombre}")
    public ResponseEntity<String> updateEdificio(@PathVariable int id, @PathVariable int numero, @PathVariable String nombre){
        try{
            return new ResponseEntity<>(edificiosService.updateEdificio(id, numero, nombre).toString(), new HttpHeaders(), HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(e.getMessage(), new HttpHeaders(), HttpStatus.BAD_REQUEST);
        }

    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteEdificio(@PathVariable int id) {
        try{
            edificiosService.deleteEdificio(id);
            return new ResponseEntity<>("Se eliminó el edificio con id: " + id, new HttpHeaders(), HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(e.getMessage(), new HttpHeaders(), HttpStatus.BAD_REQUEST);
        }
    }

}

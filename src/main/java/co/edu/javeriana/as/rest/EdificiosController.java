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

    @GetMapping
    public ResponseEntity<String> getEdificios() {
        return new ResponseEntity<>(edificiosService.getEdificios().toString(), new HttpHeaders(), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<String> getEdificios(@RequestParam int idEdificio) {
        try {
            return new ResponseEntity<>(edificiosService.getEdificio(idEdificio).toString(), new HttpHeaders(), HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(e.getMessage(), new HttpHeaders(), HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping
    public ResponseEntity<String> addEdificio(@RequestParam int numero, @RequestParam String nombre){
        try{
            return new ResponseEntity<>(edificiosService.addEdificio(numero, nombre).toString(), new HttpHeaders(), HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(e.getMessage(), new HttpHeaders(), HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping
    public ResponseEntity<String> updateEdificio(@RequestParam int id, @RequestParam int numero, @RequestParam String nombre){
        try{
            return new ResponseEntity<>(edificiosService.updateEdificio(id, numero, nombre).toString(), new HttpHeaders(), HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(e.getMessage(), new HttpHeaders(), HttpStatus.BAD_REQUEST);
        }

    }

    @DeleteMapping
    public ResponseEntity<String> deleteEdificio(@RequestParam int id) {
        try{
            edificiosService.deleteEdificio(id);
            return new ResponseEntity<>("Se eliminó el edificio con id: " + id, new HttpHeaders(), HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(e.getMessage(), new HttpHeaders(), HttpStatus.BAD_REQUEST);
        }
    }

}

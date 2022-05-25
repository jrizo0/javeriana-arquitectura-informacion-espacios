package co.edu.javeriana.as.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.javeriana.as.model.Espacio;
import co.edu.javeriana.as.services.EspaciosService;

@RestController
@RequestMapping("espacios")
public class EspaciosController {
    @Autowired 
	EspaciosService espacioService;
	
	
	@GetMapping("holamundo")
	public String saludar() {
		return "hola";
    	}
	
	@GetMapping("obtenerEdificios")
	public List<Espacio> obtenermayoresespacios() {
		List <Espacio> n1=espacioService.findAll();
		return n1;
	}
	@PostMapping("Actualizaredificio")
	
	public Espacio update (@RequestBody Espacio e){
		return espacioService.update(e);
	}
	@DeleteMapping(value="Eliminar")
	public Boolean delete (@RequestBody Espacio e) {
		return espacioService.Delete(e);
		
	}
	@PutMapping("Crear")
	public boolean crearesp (@RequestBody Espacio e) {
		return espacioService.Create(e);
	}
}
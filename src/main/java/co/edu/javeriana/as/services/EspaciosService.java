package co.edu.javeriana.as.services;

import co.edu.javeriana.as.exceptions.EdificioNotFoundException;
import co.edu.javeriana.as.exceptions.EspacioNotFoundException;
import co.edu.javeriana.as.model.Espacio;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EspaciosService {
	List<Espacio> findAll();
	List<Espacio> maxcapacidad(int x);
	Espacio update(Espacio x) ;
	boolean Delete (Espacio x);
	boolean Create (Espacio x);
}

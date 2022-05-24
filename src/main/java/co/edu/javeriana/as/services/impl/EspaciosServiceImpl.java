package co.edu.javeriana.as.services.impl;

import co.edu.javeriana.as.exceptions.EdificioNotFoundException;
import co.edu.javeriana.as.exceptions.EspacioNotFoundException;
import co.edu.javeriana.as.model.Edificio;
import co.edu.javeriana.as.model.Espacio;
import co.edu.javeriana.as.repository.EdificiosRepository;
import co.edu.javeriana.as.repository.EspaciosRepository;
import co.edu.javeriana.as.services.EspaciosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
@Service
public class EspaciosServiceImpl implements EspaciosService {
	
	@Autowired
	EspaciosRepository espaciosRepository ;
	@Autowired
	EdificiosRepository edificiosRepository ;

	@Override
	public List<Espacio> getEspacios() {
		return null;
	}

	@Override
	public Espacio getEspacio(int idEspacio) throws EspacioNotFoundException {
		return null;
	}

	@Override
	public void addEspacio(int idEspacio, String nombre, String descripcion, int capacidad, int idEdificio) throws EdificioNotFoundException {

	}

	@Override
	public void updateEspacio(int idEspacio, String nombre, String descripcion, int capacidad, int idEdificio) throws EspacioNotFoundException {

	}

	@Override
	public void deleteEspacio(int idEspacio) throws EspacioNotFoundException {

	}
}

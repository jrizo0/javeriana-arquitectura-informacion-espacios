package co.edu.javeriana.as.services;

import co.edu.javeriana.as.exceptions.EdificioNotFoundException;
import co.edu.javeriana.as.exceptions.EspacioNotFoundException;
import co.edu.javeriana.as.model.Espacio;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EspaciosService {
	public List<Espacio> getEspacios();
	public Espacio getEspacio(int idEspacio) throws EspacioNotFoundException;
	public void addEspacio(int idEspacio, String nombre, String descripcion, int capacidad, int idEdificio) throws EdificioNotFoundException;
	public void updateEspacio(int idEspacio, String nombre, String descripcion, int capacidad, int idEdificio) throws EspacioNotFoundException;
	public void deleteEspacio(int idEspacio) throws EspacioNotFoundException;
}

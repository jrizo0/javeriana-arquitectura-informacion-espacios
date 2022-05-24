package co.edu.javeriana.as.services;

import co.edu.javeriana.as.exceptions.EdificioNotFoundException;
import co.edu.javeriana.as.model.Edificio;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EdificiosService {
    List<Edificio> getEdificios();
    Edificio getEdificio(int idEdificio);
    Edificio addEdificio(int numero, String nombre);
    Edificio updateEdificio(int idEdificio, int numero, String nombre) throws EdificioNotFoundException;
    void deleteEdificio(int idEdificio) throws EdificioNotFoundException;
}

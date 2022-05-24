package co.edu.javeriana.as.services;

import co.edu.javeriana.as.exceptions.EdificioNotFoundException;
import co.edu.javeriana.as.model.Edificio;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EdificioService {
    public List<Edificio> getEdificios();
    public Edificio getEdificio(String idEdificio);
    public void addEdificio(int idEdificio, int numero, String nombre);
    public void updateEdificio(int idEdificio, int numero, String nombre) throws EdificioNotFoundException;
    public void deleteEdificio(int idEdificio) throws EdificioNotFoundException;
}

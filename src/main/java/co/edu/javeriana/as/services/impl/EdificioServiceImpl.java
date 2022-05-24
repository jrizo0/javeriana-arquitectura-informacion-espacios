package co.edu.javeriana.as.services.impl;

import co.edu.javeriana.as.exceptions.EdificioNotFoundException;
import co.edu.javeriana.as.model.Edificio;
import co.edu.javeriana.as.services.EdificioService;

import java.util.List;

public class EdificioServiceImpl implements EdificioService {

    @Override
    public List<Edificio> getEdificios() {
        return null;
    }

    @Override
    public Edificio getEdificio(String idEdificio) {
        return null;
    }

    @Override
    public void addEdificio(int idEdificio, int numero, String nombre) {
        //todo implementar
    }

    @Override
    public void updateEdificio(int idEdificio, int numero, String nombre) throws EdificioNotFoundException {

    }

    @Override
    public void deleteEdificio(int idEdificio) throws EdificioNotFoundException {

    }
}

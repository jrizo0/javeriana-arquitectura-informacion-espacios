package co.edu.javeriana.as.services.impl;

import co.edu.javeriana.as.exceptions.EdificioNotFoundException;
import co.edu.javeriana.as.model.Edificio;
import co.edu.javeriana.as.repository.EdificiosRepository;
import co.edu.javeriana.as.repository.EspaciosRepository;
import co.edu.javeriana.as.services.EdificiosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
public class EdificiosServiceImpl implements EdificiosService {

    @Autowired
    EspaciosRepository espaciosRepository ;
    @Autowired
    EdificiosRepository edificiosRepository ;

    @Override
    public List<Edificio> getEdificios() {
        List<Edificio> result = new ArrayList<>();
        edificiosRepository.findAll().forEach(result::add);
        return result;
    }

    @Override
    public Edificio getEdificio(int idEdificio) {
        return edificiosRepository.findById(idEdificio).orElseThrow(() -> new EdificioNotFoundException(idEdificio));
    }

    @Override
    public Edificio addEdificio(int numero, String nombre) {
        return edificiosRepository.save(new Edificio(numero, nombre));
    }

    @Override
    @Transactional
    public Edificio updateEdificio(int idEdificio, int numero, String nombre) throws EdificioNotFoundException {
        Edificio edificio = edificiosRepository.findById(idEdificio).orElseThrow(() -> new EdificioNotFoundException(idEdificio));
        edificio.setNombre(nombre);
        edificio.setNumero(numero);
        return edificiosRepository.save(edificio);
    }

    @Override
    public void deleteEdificio(int idEdificio) throws EdificioNotFoundException {
        edificiosRepository.deleteById(idEdificio);
    }
}

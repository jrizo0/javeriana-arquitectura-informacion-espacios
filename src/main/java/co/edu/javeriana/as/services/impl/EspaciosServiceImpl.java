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
	EspaciosRepository infoespaciosRepository ;
	
	@Override
	public List<Espacio> findAll() {
		// TODO Auto-generated method stub
		return infoespaciosRepository.findAll();
	}
	
	

	@Override
	public List<Espacio> maxcapacidad(int x) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public Espacio update(Espacio x) {
		Espacio esp=infoespaciosRepository.findById(x.getId_espacio()).orElseThrow(() -> 
		new EspacioNotFoundException(x.getId_espacio()));
		return infoespaciosRepository.save(esp);
		
	}



	@Override
	public boolean Delete(Espacio x) {
	infoespaciosRepository.deleteById(x.getId_espacio());
	
		return true;
	}



	@Override
	public boolean Create(Espacio x) {
		infoespaciosRepository.save(x);
		return true;
		
	}
}

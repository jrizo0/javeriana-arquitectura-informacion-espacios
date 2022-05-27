package co.edu.javeriana.as.configuration;

import co.edu.javeriana.as.model.Edificio;
import co.edu.javeriana.as.model.Espacio;
import co.edu.javeriana.as.repository.EdificiosRepository;
import co.edu.javeriana.as.repository.EspaciosRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class LoadData {

    @Bean
    CommandLineRunner initDatabase(EdificiosRepository edificiosRepository, EspaciosRepository espaciosRepository){
        return args -> {
//            System.out.println("Cargando información...");
//            Edificio baron = new Edificio(3, "Barón");
//            Edificio cubos = new Edificio(45, "Cubos");
//            Espacio salon30 = new Espacio("salon30", 40, baron);
//            Espacio salon200 = new Espacio("salon200", 30, cubos);
//            Espacio salon201 = new Espacio("salon201", 30, cubos);
//            edificiosRepository.save(baron);
//            edificiosRepository.save(cubos);
//            espaciosRepository.save(salon30);
//            espaciosRepository.save(salon200);
//            espaciosRepository.save(salon201);
//            System.out.println("Termina el cargue de información.");
        };
    }
}
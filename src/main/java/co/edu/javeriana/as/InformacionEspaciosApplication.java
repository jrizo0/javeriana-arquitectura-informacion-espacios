package co.edu.javeriana.as;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("co.edu.javeriana.as.model")
@ComponentScan({"co.edu.javeriana.as.rest", "co.edu.javeriana.as.services", "co.edu.javeriana.as.configuration"})
@EnableJpaRepositories("co.edu.javeriana.as.repository")
public class InformacionEspaciosApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(InformacionEspaciosApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(InformacionEspaciosApplication.class, args);
    }

}

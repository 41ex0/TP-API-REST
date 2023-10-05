package Principal.TPAPI;

import Principal.TPAPI.entities.Persona;
import Principal.TPAPI.repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TpApiApplication {

	@Autowired
	PersonaRepository personaRepository;

	public static void main(String[] args) {
		SpringApplication.run(TpApiApplication.class, args);
		System.out.println("Estoy funcionando");
	}

	@Bean
	CommandLineRunner init(PersonaRepository personaRepository) {
		return args -> {
			System.out.println("---------ESTOY FUNCIONANDO---------");

			Persona persona1 = Persona.builder()
					.nombre("Geronimo")
					.apellido("Gomez")
					.dni(40000000)
					.build();

			personaRepository.save(persona1);
		};

	}
}
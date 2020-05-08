package nicolini.will.h2dbmanha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class H2dbmanhaApplication {

	public static void main(String[] args) {
		SpringApplication.run(H2dbmanhaApplication.class, args);

		System.out.println("Exemplo de 2H e SQL");
	}

}

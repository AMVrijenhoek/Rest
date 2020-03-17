package com.example.accessingdatarest;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AccessingDataRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccessingDataRestApplication.class, args);
	}

	
	@Bean
	public CommandLineRunner demo(PersonRepository repository){
		return (arg) -> {
			//Add some new people to the database
			repository.save(new Person("dave",34, true));
			repository.save(new Person("john",22, true));
			repository.save(new Person("jack",53, true));
			repository.save(new Person("gary",98, false));

		};
	}

}

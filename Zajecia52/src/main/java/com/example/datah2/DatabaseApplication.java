package com.example.datah2;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DatabaseApplication {

	public static void main(String[] args) {

		SpringApplication.run(DatabaseApplication.class, args);
	}

	@Bean
	CommandLineRunner addStudents(StudentRepository repository){
		return (args)->{
			for(int i=0;i<100;i++) {
				repository.save(new Student("Przemysław", "Stokłosa" + i));
				repository.save(new Student("Piotr", "Stokłosa" + i));
			}
		};
	}

}

package com.example.demo;

import com.example.demo.entity.Course;
import com.example.demo.entity.CourseRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;

@SpringBootApplication
public class Demo1103Application {

	private static final Logger log = LoggerFactory.getLogger(Demo1103Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Demo1103Application.class);
	}

	@Bean
	public CommandLineRunner demo(CourseRepository repository) {
		return (args) -> {
			// save a few customers
			repository.save(new Course("java", LocalDate.of(2021,9,19),LocalDate.of(2022,5,15)));
			repository.save(new Course("js",  LocalDate.of(2021,5,10),LocalDate.of(2022,4,28)));
			repository.save(new Course("php",  LocalDate.of(2021,12,27),LocalDate.of(2022,9,10)));


			// fetch all customers
			log.info("Customers found with findAll():");
			log.info("-------------------------------");
			for (Course course : repository.findAll()) {
				log.info(course.toString());
			}
			log.info("");

			// fetch an individual customer by ID
			Course course = repository.findById(1L);
			log.info("Customer found with findById(1L):");
			log.info("--------------------------------");
			log.info(course.toString());
			log.info("");

			// fetch customers by last name
			log.info("Customer found with findByName('js'):");
			log.info("--------------------------------------------");
			repository.findByName("js").forEach(js -> {
				log.info(js.toString());
			});
			// for (Customer bauer : repository.findByLastName("Bauer")) {
			//  log.info(bauer.toString());
			// }
			log.info("");
		};
	}
}

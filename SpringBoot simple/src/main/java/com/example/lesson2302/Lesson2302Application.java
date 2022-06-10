package com.example.lesson2302;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Lesson2302Application extends SpringBootServletInitializer {
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Lesson2302Application.class);
	}
	public static void main(String[] args) {
		SpringApplication.run(Lesson2302Application.class, args);
	}

	@RequestMapping(value = "/")
	public String hello() {
		return "Hello World";
	}
}

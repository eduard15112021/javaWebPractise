package com.my.example.demo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class Demo1Application  extends SpringBootServletInitializer {
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Demo1Application.class);
	}
	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
	}

	@RequestMapping(value = "/")
	public String hello() {
		return "Hello World from Tomcat";
	}
//	@RequestMapping(value = "/")
//	public String hello() {
//		return "Hello World";
//	}
}

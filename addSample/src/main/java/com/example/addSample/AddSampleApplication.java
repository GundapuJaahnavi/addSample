package com.example.addSample;

import org.springframework.boot.SpringApplication;
		import org.springframework.boot.autoconfigure.SpringBootApplication;
		import org.springframework.web.bind.annotation.PostMapping;
		import org.springframework.web.bind.annotation.RequestBody;
		import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class AddSampleApplication {

	public static void main(String[] args) {

		SpringApplication.run(AddSampleApplication.class, args);
	}
}


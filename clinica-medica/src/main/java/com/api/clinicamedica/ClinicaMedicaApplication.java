package com.api.clinicamedica;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
public class ClinicaMedicaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClinicaMedicaApplication.class, args);
	}
	
	@GetMapping("/")
	public String index(){
		return "test";
	}

}

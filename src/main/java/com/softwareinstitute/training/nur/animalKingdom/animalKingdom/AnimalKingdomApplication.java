package com.softwareinstitute.training.nur.animalKingdom.animalKingdom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AnimalKingdomApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnimalKingdomApplication.class, args);
	}

	@GetMapping("/customRoute")
	public String myResponse(){
		AnimalList aniList = new AnimalList();
		return aniList.toString();
	}
}

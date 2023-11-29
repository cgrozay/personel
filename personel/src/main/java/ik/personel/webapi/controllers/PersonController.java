package ik.personel.webapi.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ik.personel.business.abstracts.PersonService;
import ik.personel.business.responses.person.GetAllPersonResponse;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/persons")
@CrossOrigin
@AllArgsConstructor
public class PersonController {

	private PersonService personService;
	
	@GetMapping
	List<GetAllPersonResponse> getAllPersonResponses(){
		return this.personService.getAllPersonResponses();
	}
}

package ik.personel.webapi.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import ik.personel.business.abstracts.PersonService;
import ik.personel.business.requests.person.CreatePersonRequest;
import ik.personel.business.requests.person.UpdatePersonRequest;
import ik.personel.business.responses.person.GetAllPersonResponse;
import ik.personel.business.responses.person.GetAllPersonsViewResponse;
import ik.personel.business.responses.person.GetByNormIdPersonResponse;
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
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public void add(CreatePersonRequest createPersonRequest) {
		this.personService.add(createPersonRequest);
	}
	@PutMapping("/{id}")
	public void update(UpdatePersonRequest updatePersonRequest) {
		this.personService.update(updatePersonRequest);
	}
	@DeleteMapping("/{id}")
	public void delete(int id) {
		this.personService.delete(id);
	}
	@GetMapping("/personsview")
	List<GetAllPersonsViewResponse> getAllPersonsViewResponses(){
		return this.personService.getAllPersonsViewResponses();
	}
	@GetMapping("/personview/{id}")
	public List<GetByNormIdPersonResponse> getByNormIdPersonResponse(int id) {
		return this.personService.getByNormIdPersonResponse(id);
	}
}

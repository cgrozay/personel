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

import ik.personel.business.abstracts.EducationService;
import ik.personel.business.requests.education.CreateEducationRequest;
import ik.personel.business.requests.education.UpdateEducationRequest;
import ik.personel.business.responses.education.GetAllEducationResponse;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/educations")
@CrossOrigin
@AllArgsConstructor
public class EducationController {

	private EducationService educationService;
	@GetMapping
	public List<GetAllEducationResponse> getAllEducationResponses(){
		return this.educationService.getAllEducationResponses();
	}
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public void add(CreateEducationRequest createEducationRequest) {
		this.educationService.add(createEducationRequest);
	}
	@PutMapping("/{id}")
	public void update(UpdateEducationRequest updateEducationRequest) {
		this.educationService.update(updateEducationRequest);
	}
	@DeleteMapping("{id}")
	public void delete(int id) {
		this.educationService.delete(id);
	}
}

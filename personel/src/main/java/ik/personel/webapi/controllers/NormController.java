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

import ik.personel.business.abstracts.NormService;
import ik.personel.business.requests.norm.CreateNormRequest;
import ik.personel.business.requests.norm.UpdateNormRequest;
import ik.personel.business.responses.norm.GetAllNormResponse;
import lombok.AllArgsConstructor;

@RequestMapping("/api/norms")
@RestController
@AllArgsConstructor
@CrossOrigin
public class NormController {

	private NormService normService;
	
	@GetMapping
	public List<GetAllNormResponse> getAllNormResponses(){
		return this.normService.getAllNormResponses();
	}
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public void add(CreateNormRequest createNormRequest) {
		this.normService.add(createNormRequest);
	}
	@PutMapping("/{id}")
	public void update(UpdateNormRequest updateNormRequest) {
		this.normService.update(updateNormRequest);
	}
	@DeleteMapping("/{id}")
	public void delete(int id) {
		this.normService.delete(id);
	}
}

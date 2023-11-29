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

import ik.personel.business.abstracts.ScopeService;
import ik.personel.business.requests.scope.CreateScopeRepuest;
import ik.personel.business.requests.scope.UpdateScopeRequest;
import ik.personel.business.responses.scope.GetAllScopeResponse;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/scopes")
@CrossOrigin
@AllArgsConstructor
public class ScopeController {

	private ScopeService scopeService;
	@GetMapping
	public List<GetAllScopeResponse> getAllScopeResponses(){
		return this.scopeService.getAllScopeResponses();
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public void add(CreateScopeRepuest createScopeRepuest) {
		this.scopeService.add(createScopeRepuest);
	}
	@PutMapping("/{id}")
	public void update(UpdateScopeRequest updateScopeRequest) {
		this.scopeService.update(updateScopeRequest);
	}
	@DeleteMapping("/{id}")
	public void delete(int id) {
		this.scopeService.delete(id);
	}
}

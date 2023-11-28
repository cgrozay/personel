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

import ik.personel.business.abstracts.TitleService;
import ik.personel.business.requests.title.CreateTitleRequest;
import ik.personel.business.requests.title.UpdateTitleRequest;
import ik.personel.business.responses.title.GetAllTitleResponse;
import lombok.AllArgsConstructor;

@RequestMapping("/api/titles")
@RestController
@CrossOrigin
@AllArgsConstructor
public class TitleController {

	private TitleService titleService;
	
	@GetMapping
	public List<GetAllTitleResponse> getAllTitleResponses(){
		return this.titleService.getAllTitleResponses();
	}
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public void add(CreateTitleRequest createTitleRequest) {
		this.titleService.add(createTitleRequest);
	}
	@PutMapping("/{id}")
	public void update(UpdateTitleRequest updateTitleRequest) {
		this.titleService.update(updateTitleRequest);
	}
	@DeleteMapping("/{id}")
	public void delete(int id) {
		this.titleService.delete(id);
	}
}

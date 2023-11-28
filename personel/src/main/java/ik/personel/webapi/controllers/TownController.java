package ik.personel.webapi.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ik.personel.business.abstracts.TownService;
import ik.personel.business.requests.town.CreateTownRequest;
import ik.personel.business.requests.town.UpdateTownRequest;
import ik.personel.business.responses.town.GetAllTownResponse;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/towns")
@CrossOrigin
@AllArgsConstructor
public class TownController {

	private TownService townService;
	@GetMapping
	public List<GetAllTownResponse> getAllTownResponses(){
		return this.townService.getAllTownResponses();
	}
	@PostMapping()
	public void add(CreateTownRequest createTownRequest) {
		this.townService.add(createTownRequest);
	}
	@PutMapping("/{id}")
	public void update(UpdateTownRequest updateTownRequest) {
		this.townService.update(updateTownRequest);
	}
	@DeleteMapping("/{id}")
	public void delete(int id) {
		this.townService.delete(id);
	}
}

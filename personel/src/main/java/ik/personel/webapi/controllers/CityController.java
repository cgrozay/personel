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

import ik.personel.business.abstracts.CityService;
import ik.personel.business.requests.city.CreateCityRequest;
import ik.personel.business.requests.city.UpdateCİtyRequest;
import ik.personel.business.responses.city.GetAllCityResponse;
import lombok.AllArgsConstructor;

@RequestMapping("/api/cities")
@RestController
@CrossOrigin
@AllArgsConstructor
public class CityController {

	private CityService cityService;
	@GetMapping
	public List<GetAllCityResponse> getAllCityResponses(){
		return this.cityService.getAllCityResponses();
	}
	@PostMapping()
	@ResponseStatus(code = HttpStatus.CREATED)
	public void add(CreateCityRequest createCityRequest) {
		this.cityService.add(createCityRequest);
	}
	@PutMapping("/{id}")
	public void update(UpdateCİtyRequest updateCİtyRequest) {
		this.cityService.update(updateCİtyRequest);
	}
	@DeleteMapping("/{id}")
	public void delete(int id) {
		this.cityService.delete(id);
	}
}

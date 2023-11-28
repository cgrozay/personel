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

import ik.personel.business.abstracts.PositionService;
import ik.personel.business.requests.position.CreatePositionRequest;
import ik.personel.business.requests.position.UpdatePositionRequest;
import ik.personel.business.responses.position.GetAllPositionResponse;
import lombok.AllArgsConstructor;

@RequestMapping("/api/positions")
@RestController
@CrossOrigin
@AllArgsConstructor
public class PositionController {

	private PositionService positionService;
	
	@GetMapping
	public List<GetAllPositionResponse> gekAllPositionResponses(){
		return this.positionService.getAllPositionResponses();
	}
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public void add(CreatePositionRequest createPositionRequest) {
		this.positionService.add(createPositionRequest);
	}
	@PutMapping("/{id}")
	public void update(UpdatePositionRequest updatePositionRequest) {
		this.positionService.update(updatePositionRequest);
	}
	@DeleteMapping("/{id}")
	public void delete(int id) {
		this.positionService.delete(id);
	}
}

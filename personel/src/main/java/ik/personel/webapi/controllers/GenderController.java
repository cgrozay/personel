package ik.personel.webapi.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ik.personel.business.abstracts.GenderService;
import ik.personel.business.responses.gender.GetAllGenderResponse;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/genders")
@AllArgsConstructor
@CrossOrigin
public class GenderController {

	private GenderService genderService;
	
	@GetMapping()
	public List<GetAllGenderResponse> getAllGenderResponses(){
	return	this.genderService.getAllGenderResponses();
	}
}

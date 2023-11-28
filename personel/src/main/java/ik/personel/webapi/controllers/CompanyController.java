package ik.personel.webapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import ik.personel.business.abstracts.CompanyServices;
import ik.personel.business.requests.company.CreateCompanyRequest;
import ik.personel.business.requests.company.UpdateCompanyRequest;
import ik.personel.business.responses.company.GetAllCompanyResponse;
import lombok.AllArgsConstructor;

@RequestMapping("/api/company")
@RestController
@AllArgsConstructor
@CrossOrigin
public class CompanyController {

	@Autowired
	private CompanyServices companyServices;
	
	@GetMapping("/getall")
	public List<GetAllCompanyResponse> getAllCompanyResponses(){
		return this.companyServices.getAllCompanyResponses();
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public void add(CreateCompanyRequest createCompanyRequest) {
		this.companyServices.add(createCompanyRequest);
	}
	
	@PutMapping("/{id}")
	public void update(UpdateCompanyRequest updateCompanyRequest) {
		this.companyServices.update(updateCompanyRequest);
	}
	
	@DeleteMapping("/{id}")
	public void delete(int id) {
		this.companyServices.delete(id);
	}
}

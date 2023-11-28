package ik.personel.webapi.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import ik.personel.business.abstracts.DepartmentService;
import ik.personel.business.requests.department.CreateDepartmentRequest;
import ik.personel.business.requests.department.UpdateDepartmentRequest;
import ik.personel.business.responses.department.GetAllDepartmentResponse;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/departments")
@AllArgsConstructor
@CrossOrigin
public class DepartmentController {

	private DepartmentService departmentService;

	@GetMapping
	public List<GetAllDepartmentResponse> getAllDepartmentResponses() {
		return this.departmentService.getAllDepartmentResponses();
	}
	
	@PostMapping()
	@ResponseStatus(code = HttpStatus.CREATED)
	public void add(CreateDepartmentRequest createDepartmentRequest) {
		this.departmentService.add(createDepartmentRequest);
	}
	@PutMapping("/{id}")
	public void update(UpdateDepartmentRequest updateDepartmentRequest) {
		this.departmentService.update(updateDepartmentRequest);
	}
}

package ik.personel.business.concretes;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import ik.personel.business.abstracts.DepartmentService;
import ik.personel.business.requests.department.CreateDepartmentRequest;
import ik.personel.business.requests.department.UpdateDepartmentRequest;
import ik.personel.business.responses.department.GetAllDepartmentResponse;
import ik.personel.core.utilities.mapper.ModelMapperService;
import ik.personel.dataAccess.abstracts.DepartmentRepository;
import ik.personel.entities.concretes.Department;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class DepartmentManager implements DepartmentService {

	private DepartmentRepository departmentRepository;
	private ModelMapperService modelMapperService;

	@Override
	public List<GetAllDepartmentResponse> getAllDepartmentResponses() {
		List<Department> departments = this.departmentRepository.findAll();
		List<GetAllDepartmentResponse> getAllDepartmentResponses = departments.stream().map(
				department -> this.modelMapperService.forResponse().map(department, GetAllDepartmentResponse.class))
				.collect(Collectors.toList());
		return getAllDepartmentResponses;
	}

	@Override
	public void add(CreateDepartmentRequest createDepartmentRequest) {
		Department department=this.modelMapperService.forRequest().map(createDepartmentRequest, Department.class);
		department.setId(0);
		this.departmentRepository.save(department);

	}

	@Override
	public void update(UpdateDepartmentRequest updateDepartmentRequest) {
		Department department=this.modelMapperService.forRequest().map(updateDepartmentRequest, Department.class);
		this.departmentRepository.save(department);

	}

}

package ik.personel.business.abstracts;

import java.util.List;

import ik.personel.business.requests.department.CreateDepartmentRequest;
import ik.personel.business.requests.department.UpdateDepartmentRequest;
import ik.personel.business.responses.department.GetAllDepartmentResponse;

public interface DepartmentService {

	List<GetAllDepartmentResponse> getAllDepartmentResponses();
	void add(CreateDepartmentRequest createDepartmentRequest);
	void update(UpdateDepartmentRequest updateDepartmentRequest);
	void delete(int id);
}

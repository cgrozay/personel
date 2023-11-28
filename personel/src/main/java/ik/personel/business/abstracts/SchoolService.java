package ik.personel.business.abstracts;

import java.util.List;

import ik.personel.business.requests.school.CreateSchoolRequest;
import ik.personel.business.requests.school.UpdateSchoolRequest;
import ik.personel.business.responses.school.GetAllSchoolResponse;
import ik.personel.business.responses.school.GetByIdSchoolResponse;


public interface SchoolService {

	List<GetAllSchoolResponse> getAllSchoolResponses();
	GetByIdSchoolResponse getByIdSchoolResponse(int id);
	void add (CreateSchoolRequest createSchoolRequest);
	void update(UpdateSchoolRequest updateSchoolRequest);
	void delete(int id);
}

package ik.personel.business.abstracts;

import java.util.List;

import ik.personel.business.requests.education.CreateEducationRequest;
import ik.personel.business.requests.education.UpdateEducationRequest;
import ik.personel.business.responses.education.GetAllEducationResponse;

public interface EducationService {

	List<GetAllEducationResponse> getAllEducationResponses();
	void add(CreateEducationRequest createEducationRequest);
	void update(UpdateEducationRequest updateEducationRequest);
	void delete(int id);
}

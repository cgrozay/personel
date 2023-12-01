package ik.personel.business.abstracts;

import java.util.List;

import ik.personel.business.requests.person.CreatePersonRequest;
import ik.personel.business.requests.person.UpdatePersonRequest;
import ik.personel.business.responses.person.GetAllPersonResponse;
import ik.personel.business.responses.person.GetAllPersonsViewResponse;
import ik.personel.business.responses.person.GetByNormIdPersonResponse;

public interface PersonService {

	List<GetAllPersonResponse> getAllPersonResponses();
	List<GetAllPersonsViewResponse> getAllPersonsViewResponses();
	List<GetByNormIdPersonResponse> getByNormIdPersonResponse(int id);
	void add(CreatePersonRequest createPersonRequest);
	void update(UpdatePersonRequest updatePersonRequest);
	void delete(int id);
}

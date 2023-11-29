package ik.personel.business.abstracts;

import java.util.List;

import ik.personel.business.requests.person.CreatePersonRequest;
import ik.personel.business.requests.person.UpdatePersonRequest;
import ik.personel.business.responses.person.GetAllPersonResponse;

public interface PersonService {

	List<GetAllPersonResponse> getAllPersonResponses();
	void add(CreatePersonRequest createPersonRequest);
	void update(UpdatePersonRequest updatePersonRequest);
	void delete(int id);
}

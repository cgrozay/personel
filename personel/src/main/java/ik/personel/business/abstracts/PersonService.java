package ik.personel.business.abstracts;

import java.util.List;

import ik.personel.business.requests.person.CreatePersonRequest;
import ik.personel.business.requests.person.UpdatePersonRequest;
import ik.personel.business.responses.person.GetAllPersonResponse;
import ik.personel.business.responses.person.GetAllPersonsViewResponse;
import ik.personel.business.responses.person.GetByCompanyCityTownPersonse;
import ik.personel.business.responses.person.GetByNormIdPersonResponse;
import ik.personel.entities.dto.PersonView;

public interface PersonService {

	List<GetAllPersonResponse> getAllPersonResponses();
	List<GetAllPersonsViewResponse> getAllPersonsViewResponses();
	List<GetByNormIdPersonResponse> getByNormIdPersonResponse(int id);
	List<GetByCompanyCityTownPersonse> getByCompanyCityTownPersonses(String companyTitle,String cityName,String townName);
	void add(CreatePersonRequest createPersonRequest);
	void update(UpdatePersonRequest updatePersonRequest);
	void delete(int id);
}

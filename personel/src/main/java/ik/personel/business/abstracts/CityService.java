package ik.personel.business.abstracts;

import java.util.List;

import ik.personel.business.requests.city.CreateCityRequest;
import ik.personel.business.requests.city.UpdateCİtyRequest;
import ik.personel.business.responses.city.GetAllCityResponse;

public interface CityService {

	List<GetAllCityResponse> getAllCityResponses();
	void add(CreateCityRequest createCityRequest);
	void update(UpdateCİtyRequest updateCİtyRequest);
	void delete(int id);
}

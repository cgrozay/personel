package ik.personel.business.abstracts;

import java.util.List;

import ik.personel.business.requests.town.CreateTownRequest;
import ik.personel.business.requests.town.UpdateTownRequest;
import ik.personel.business.responses.town.GetAllTownResponse;

public interface TownService {

	List<GetAllTownResponse> getAllTownResponses();
	void add(CreateTownRequest createTownRequest);
	void update(UpdateTownRequest updateTownRequest);
	void delete(int id);
}

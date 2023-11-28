package ik.personel.business.abstracts;

import java.util.List;

import ik.personel.business.requests.position.CreatePositionRequest;
import ik.personel.business.requests.position.UpdatePositionRequest;
import ik.personel.business.responses.position.GetAllPositionResponse;

public interface PositionService {

	List<GetAllPositionResponse> getAllPositionResponses();
	void add(CreatePositionRequest createPositionRequest);
	void update(UpdatePositionRequest updatePositionRequest);
	void delete(int id);
}

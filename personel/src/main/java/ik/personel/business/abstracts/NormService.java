package ik.personel.business.abstracts;

import java.util.List;

import ik.personel.business.requests.norm.CreateNormRequest;
import ik.personel.business.requests.norm.UpdateNormRequest;
import ik.personel.business.responses.norm.GetAllNormResponse;

public interface NormService {

	List<GetAllNormResponse> getAllNormResponses();
	void add(CreateNormRequest createNormRequest);
	void update(UpdateNormRequest updateNormRequest);
	void delete(int id);
}

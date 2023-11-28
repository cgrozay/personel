package ik.personel.business.abstracts;

import java.util.List;

import ik.personel.business.requests.title.CreateTitleRequest;
import ik.personel.business.requests.title.UpdateTitleRequest;
import ik.personel.business.responses.title.GetAllTitleResponse;

public interface TitleService {

	List<GetAllTitleResponse> getAllTitleResponses();
	void add(CreateTitleRequest createTitleRequest);
	void update(UpdateTitleRequest updateTitleRequest);
	void delete(int id);
}

package ik.personel.business.abstracts;

import java.util.List;

import ik.personel.business.requests.scope.CreateScopeRepuest;
import ik.personel.business.requests.scope.UpdateScopeRequest;
import ik.personel.business.responses.scope.GetAllScopeResponse;

public interface ScopeService {

	List<GetAllScopeResponse> getAllScopeResponses();
	void add(CreateScopeRepuest createScopeRepuest);
	void update(UpdateScopeRequest updateScopeRequest);
	void delete (int id);
}

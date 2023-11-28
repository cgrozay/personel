package ik.personel.business.abstracts;

import java.util.List;

import ik.personel.business.requests.company.CreateCompanyRequest;
import ik.personel.business.requests.company.UpdateCompanyRequest;
import ik.personel.business.responses.company.GetAllCompanyResponse;

public interface CompanyServices {

	List<GetAllCompanyResponse> getAllCompanyResponses();
	void add(CreateCompanyRequest createCompanyRequest);
	void update(UpdateCompanyRequest updateCompanyRequest);
	void delete(int id);
	
}

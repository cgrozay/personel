package ik.personel.business.concretes;


import java.util.List;

import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import ik.personel.business.abstracts.CompanyServices;
import ik.personel.business.requests.company.CreateCompanyRequest;
import ik.personel.business.requests.company.UpdateCompanyRequest;
import ik.personel.business.responses.company.GetAllCompanyResponse;
import ik.personel.core.utilities.mapper.ModelMapperService;
import ik.personel.dataAccess.abstracts.CompanyRepository;
import ik.personel.entities.concretes.Company;
import lombok.AllArgsConstructor;


@Service
@AllArgsConstructor
public class CompanyManager implements CompanyServices{

	private CompanyRepository companyRepository;
	private ModelMapperService modelMapperService;
	
	@Override
	public List<GetAllCompanyResponse> getAllCompanyResponses() {
		List<Company> firmalar=companyRepository.findAll();
		List<GetAllCompanyResponse> getAllCompanyResponses=firmalar.stream().map(firma -> this.modelMapperService.forResponse().map(firma, GetAllCompanyResponse.class)).collect(Collectors.toList());
		return getAllCompanyResponses;
	}

	@Override
	public void add(CreateCompanyRequest createCompanyRequest) {
		Company company=modelMapperService.forRequest().map(createCompanyRequest, Company.class);
		company.setId(0);
		this.companyRepository.save(company);
	}

	@Override
	public void update(UpdateCompanyRequest updateCompanyRequest) {
		Company company=modelMapperService.forRequest().map(updateCompanyRequest, Company.class);
		this.companyRepository.save(company);
	}

	@Override
	public void delete(int id) {
		this.companyRepository.deleteById(id);
		
	}

}

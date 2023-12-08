package ik.personel.business.concretes;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import ik.personel.business.abstracts.PersonService;
import ik.personel.business.requests.person.CreatePersonRequest;
import ik.personel.business.requests.person.UpdatePersonRequest;
import ik.personel.business.responses.person.GetAllPersonResponse;
import ik.personel.business.responses.person.GetAllPersonsViewResponse;
import ik.personel.business.responses.person.GetByCompanyCityTownPersonse;
import ik.personel.business.responses.person.GetByNormIdPersonResponse;
import ik.personel.core.utilities.mapper.ModelMapperService;
import ik.personel.dataAccess.abstracts.PersonRepository;
import ik.personel.dataAccess.abstracts.PersonViewRepository;
import ik.personel.entities.concretes.Person;
import ik.personel.entities.dto.PersonView;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class PersonManager implements PersonService {

	private PersonRepository personRepository;
	private ModelMapperService modelMapperService;
	private PersonViewRepository personViewRepository;

	@Override
	public List<GetAllPersonResponse> getAllPersonResponses() {
		List<Person> persons = this.personRepository.findAll();
		List<GetAllPersonResponse> getAllPersonResponses = persons.stream()
				.map(person -> this.modelMapperService.forResponse().map(person, GetAllPersonResponse.class))
				.collect(Collectors.toList());
		return getAllPersonResponses;
	}

	@Override
	public void add(CreatePersonRequest createPersonRequest) {
		Person person = this.modelMapperService.forRequest().map(createPersonRequest, Person.class);
		person.setId(0);
		this.personRepository.save(person);

	}

	@Override
	public void update(UpdatePersonRequest updatePersonRequest) {
		Person person = this.modelMapperService.forRequest().map(updatePersonRequest, Person.class);
		this.personRepository.save(person);

	}

	@Override
	public void delete(int id) {
		this.personRepository.deleteById(id);

	}

	@Override
	public List<GetAllPersonsViewResponse> getAllPersonsViewResponses() {
		List<PersonView> personViews = this.personViewRepository.findAll();
		List<GetAllPersonsViewResponse> getAllPersonsViewResponses = personViews.stream()
				.map(person -> this.modelMapperService.forResponse().map(person, GetAllPersonsViewResponse.class))
				.collect(Collectors.toList());
		return getAllPersonsViewResponses;

	}

	@Override
	public List<GetByNormIdPersonResponse> getByNormIdPersonResponse(int id) {
		List<PersonView> personViews = this.personViewRepository.findByNormId(id);
		List<GetByNormIdPersonResponse> getByNormIdPersonResponse = personViews.stream()
				.map(person -> this.modelMapperService.forResponse().map(person, GetByNormIdPersonResponse.class))
				.collect(Collectors.toList());
		return getByNormIdPersonResponse;
	}

	@Override
	public List<GetByCompanyCityTownPersonse> getByCompanyCityTownPersonses(String companyTitle, String cityName, String townName) {
		List<PersonView> personViews=this.personViewRepository.findByCompanyAndCityAndTown(companyTitle, cityName, townName);
		List<GetByCompanyCityTownPersonse> getAllPersonsViewResponses=personViews.stream().map(person->this.modelMapperService.forResponse().map(person, GetByCompanyCityTownPersonse.class)).collect(Collectors.toList());
		return getAllPersonsViewResponses;
	}

}

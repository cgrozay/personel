package ik.personel.business.concretes;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import ik.personel.business.abstracts.PersonService;
import ik.personel.business.requests.person.CreatePersonRequest;
import ik.personel.business.requests.person.UpdatePersonRequest;
import ik.personel.business.responses.person.GetAllPersonResponse;
import ik.personel.core.utilities.mapper.ModelMapperService;
import ik.personel.dataAccess.abstracts.PersonRepository;
import ik.personel.entities.concretes.Person;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class PersonManager implements PersonService {

	private PersonRepository personRepository;
	private ModelMapperService modelMapperService;

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
		Person person=this.modelMapperService.forRequest().map(createPersonRequest, Person.class);
		person.setId(0);
		this.personRepository.save(person);

	}

	@Override
	public void update(UpdatePersonRequest updatePersonRequest) {
		Person person=this.modelMapperService.forRequest().map(updatePersonRequest, Person.class);
		this.personRepository.save(person);

	}

	@Override
	public void delete(int id) {
		this.personRepository.deleteById(id);

	}

}

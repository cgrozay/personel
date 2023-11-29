package ik.personel.business.concretes;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import ik.personel.business.abstracts.GenderService;
import ik.personel.business.responses.gender.GetAllGenderResponse;
import ik.personel.core.utilities.mapper.ModelMapperService;
import ik.personel.dataAccess.abstracts.GenderRepository;
import ik.personel.entities.concretes.Gender;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class GenderManager implements GenderService {

	private ModelMapperService modelMapperService;
	private GenderRepository genderRepository;

	@Override
	public List<GetAllGenderResponse> getAllGenderResponses() {
		List<Gender> genders = this.genderRepository.findAll();
		List<GetAllGenderResponse> getAllGenderResponses = genders.stream()
				.map(gender -> this.modelMapperService.forResponse().map(gender, GetAllGenderResponse.class))
				.collect(Collectors.toList());
		return getAllGenderResponses;
	}

}

package ik.personel.business.concretes;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import ik.personel.business.abstracts.EducationService;
import ik.personel.business.requests.education.CreateEducationRequest;
import ik.personel.business.requests.education.UpdateEducationRequest;
import ik.personel.business.responses.education.GetAllEducationResponse;
import ik.personel.core.utilities.mapper.ModelMapperService;
import ik.personel.dataAccess.abstracts.EducationRepository;
import ik.personel.entities.concretes.Education;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class EducationManager implements EducationService {

	private ModelMapperService modelMapperService;
	private EducationRepository educationRepository;

	@Override
	public List<GetAllEducationResponse> getAllEducationResponses() {
		List<Education> educations = this.educationRepository.findAll();
		List<GetAllEducationResponse> getAllEducationResponses = educations.stream()
				.map(education -> this.modelMapperService.forResponse().map(education, GetAllEducationResponse.class))
				.collect(Collectors.toList());
		return getAllEducationResponses;
	}

	@Override
	public void add(CreateEducationRequest createEducationRequest) {
		Education education=this.modelMapperService.forRequest().map(createEducationRequest, Education.class);
		education.setId(0);
		this.educationRepository.save(education);

	}

	@Override
	public void update(UpdateEducationRequest updateEducationRequest) {
		Education education=this.modelMapperService.forRequest().map(updateEducationRequest, Education.class);
		this.educationRepository.save(education);

	}

	@Override
	public void delete(int id) {
		this.educationRepository.deleteById(id);

	}
}

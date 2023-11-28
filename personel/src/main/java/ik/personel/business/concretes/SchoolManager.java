package ik.personel.business.concretes;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;

import ik.personel.business.abstracts.SchoolService;
import ik.personel.business.requests.school.CreateSchoolRequest;
import ik.personel.business.requests.school.UpdateSchoolRequest;
import ik.personel.business.responses.school.GetAllSchoolResponse;
import ik.personel.business.responses.school.GetByIdSchoolResponse;
import ik.personel.core.utilities.mapper.ModelMapperService;
import ik.personel.dataAccess.abstracts.SchoolsRepository;
import ik.personel.entities.concretes.School;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class SchoolManager implements SchoolService {

	private SchoolsRepository schoolsRepository;
	private ModelMapperService modelMapperService;

	@Override
	public List<GetAllSchoolResponse> getAllSchoolResponses() {
		List<School> schools = this.schoolsRepository.findAll();
		List<GetAllSchoolResponse> getAllSchoolResponses = schools.stream()
				.map(school -> this.modelMapperService.forResponse().map(school, GetAllSchoolResponse.class))
				.collect(Collectors.toList());
		return getAllSchoolResponses;
	}

	@Override
	public void add(CreateSchoolRequest createSchoolRequest) {
		School school = this.modelMapperService.forRequest().map(createSchoolRequest, School.class);
		school.setId(0);
		schoolsRepository.save(school);

	}

	@Override
	public void update(UpdateSchoolRequest updateSchoolRequest) {
		School school = modelMapperService.forRequest().map(updateSchoolRequest, School.class);
		schoolsRepository.save(school);

	}

	@Override
	public GetByIdSchoolResponse getByIdSchoolResponse(int id) {
		School school = this.schoolsRepository.findById(id).orElseThrow();
		GetByIdSchoolResponse getByIdSchoolResponse = this.modelMapperService.forResponse().map(school,
				GetByIdSchoolResponse.class);
		return getByIdSchoolResponse;
	}

	@Override
	public void delete(int id) {
		this.schoolsRepository.deleteById(id);

	}

}

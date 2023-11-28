package ik.personel.business.concretes;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import ik.personel.business.abstracts.NormService;
import ik.personel.business.requests.norm.CreateNormRequest;
import ik.personel.business.requests.norm.UpdateNormRequest;
import ik.personel.business.responses.norm.GetAllNormResponse;
import ik.personel.core.utilities.mapper.ModelMapperService;
import ik.personel.dataAccess.abstracts.NormRepository;
import ik.personel.entities.concretes.Norm;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class NormManager implements NormService {

	private NormRepository normRepository;
	private ModelMapperService modelMapperService;

	@Override
	public List<GetAllNormResponse> getAllNormResponses() {
		List<Norm> norms = this.normRepository.findAll();
		List<GetAllNormResponse> getAllNormResponses = norms.stream()
				.map(norm -> this.modelMapperService.forResponse().map(norm, GetAllNormResponse.class))
				.collect(Collectors.toList());
		return getAllNormResponses;
	}

	@Override
	public void add(CreateNormRequest createNormRequest) {
		Norm norm=this.modelMapperService.forRequest().map(createNormRequest, Norm.class);
		norm.setId(0);
		this.normRepository.save(norm);

	}

	@Override
	public void update(UpdateNormRequest updateNormRequest) {
		Norm norm=this.modelMapperService.forRequest().map(updateNormRequest, Norm.class);
		this.normRepository.save(norm);

	}

	@Override
	public void delete(int id) {
		this.normRepository.deleteById(id);

	}

}

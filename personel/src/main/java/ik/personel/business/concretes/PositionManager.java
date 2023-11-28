package ik.personel.business.concretes;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import ik.personel.business.abstracts.PositionService;
import ik.personel.business.requests.position.CreatePositionRequest;
import ik.personel.business.requests.position.UpdatePositionRequest;
import ik.personel.business.responses.position.GetAllPositionResponse;
import ik.personel.core.utilities.mapper.ModelMapperService;
import ik.personel.dataAccess.abstracts.PositionRepository;
import ik.personel.entities.concretes.Position;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class PositionManager implements PositionService {

	private ModelMapperService modelMapperService;
	private PositionRepository positionRepository;

	@Override
	public List<GetAllPositionResponse> getAllPositionResponses() {
		List<Position> positions = this.positionRepository.findAll();
		List<GetAllPositionResponse> getAllPositionResponses = positions.stream()
				.map(position -> this.modelMapperService.forResponse().map(position, GetAllPositionResponse.class))
				.collect(Collectors.toList());
		return getAllPositionResponses;
	}

	@Override
	public void add(CreatePositionRequest createPositionRequest) {
		Position position = this.modelMapperService.forRequest().map(createPositionRequest, Position.class);
		position.setId(0);
		this.positionRepository.save(position);

	}

	@Override
	public void update(UpdatePositionRequest updatePositionRequest) {
		Position position = this.modelMapperService.forRequest().map(updatePositionRequest, Position.class);
		this.positionRepository.save(position);

	}

	@Override
	public void delete(int id) {
		this.positionRepository.deleteById(id);
	

	}

}

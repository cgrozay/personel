package ik.personel.business.concretes;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import ik.personel.business.abstracts.TownService;
import ik.personel.business.requests.town.CreateTownRequest;
import ik.personel.business.requests.town.UpdateTownRequest;
import ik.personel.business.responses.town.GetAllTownResponse;
import ik.personel.core.utilities.mapper.ModelMapperService;
import ik.personel.dataAccess.abstracts.TownRepository;
import ik.personel.entities.concretes.Town;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class TownManager implements TownService {

	private TownRepository townRepository;
	private ModelMapperService modelMapperService;

	@Override
	public List<GetAllTownResponse> getAllTownResponses() {
		List<Town> towns = this.townRepository.findAll();
		List<GetAllTownResponse> getAllTownResponses = towns.stream()
				.map(town -> this.modelMapperService.forResponse().map(town, GetAllTownResponse.class))
				.collect(Collectors.toList());
		return getAllTownResponses;
	}

	@Override
	public void add(CreateTownRequest createTownRequest) {
		Town town=this.modelMapperService.forRequest().map(createTownRequest, Town.class);
		town.setId(0);
		this.townRepository.save(town);

	}

	@Override
	public void update(UpdateTownRequest updateTownRequest) {
		Town town=this.modelMapperService.forRequest().map(updateTownRequest, Town.class);
		this.townRepository.save(town);

	}

	@Override
	public void delete(int id) {
		this.townRepository.deleteById(id);

	}

}

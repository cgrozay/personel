package ik.personel.business.concretes;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import ik.personel.business.abstracts.CityService;
import ik.personel.business.requests.city.CreateCityRequest;
import ik.personel.business.requests.city.UpdateCİtyRequest;
import ik.personel.business.responses.city.GetAllCityResponse;
import ik.personel.core.utilities.mapper.ModelMapperService;
import ik.personel.dataAccess.abstracts.CityRepository;
import ik.personel.entities.concretes.City;
import lombok.AllArgsConstructor;


@Service
@AllArgsConstructor
public class CityManager implements CityService {

	private ModelMapperService modelMapperService;
	private CityRepository cityRepository;

	@Override
	public List<GetAllCityResponse> getAllCityResponses() {
		List<City> cities = this.cityRepository.findAll();
		List<GetAllCityResponse> getAllCityResponses = cities.stream()
				.map(city -> this.modelMapperService.forResponse().map(city, GetAllCityResponse.class))
				.collect(Collectors.toList());
		return getAllCityResponses;
	}

	@Override
	public void add(CreateCityRequest createCityRequest) {
		City city=this.modelMapperService.forRequest().map(createCityRequest, City.class);
		city.setId(0);
		this.cityRepository.save(city);
	}

	@Override
	public void update(UpdateCİtyRequest updateCİtyRequest) {
		City city=this.modelMapperService.forRequest().map(updateCİtyRequest, City.class);
		this.cityRepository.save(city);

	}

	@Override
	public void delete(int id) {
		this.cityRepository.deleteById(id);

	}

}

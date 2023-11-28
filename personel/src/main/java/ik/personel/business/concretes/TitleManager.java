package ik.personel.business.concretes;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import ik.personel.business.abstracts.TitleService;
import ik.personel.business.requests.title.CreateTitleRequest;
import ik.personel.business.requests.title.UpdateTitleRequest;
import ik.personel.business.responses.title.GetAllTitleResponse;
import ik.personel.core.utilities.mapper.ModelMapperService;
import ik.personel.dataAccess.abstracts.TitleRepository;
import ik.personel.entities.concretes.Title;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class TitleManager implements TitleService {

	private TitleRepository titleRepository;
	private ModelMapperService modelMapperService;

	@Override
	public List<GetAllTitleResponse> getAllTitleResponses() {
		List<Title> titles = this.titleRepository.findAll();
		List<GetAllTitleResponse> getAllTitleResponses = titles.stream()
				.map(title -> this.modelMapperService.forResponse().map(title, GetAllTitleResponse.class))
				.collect(Collectors.toList());
		return getAllTitleResponses;
	}

	@Override
	public void add(CreateTitleRequest createTitleRequest) {
		Title title=this.modelMapperService.forRequest().map(createTitleRequest, Title.class);
		title.setId(0);
		this.titleRepository.save(title);

	}

	@Override
	public void update(UpdateTitleRequest updateTitleRequest) {
		Title title=this.modelMapperService.forRequest().map(updateTitleRequest, Title.class);
		this.titleRepository.save(title);

	}

	@Override
	public void delete(int id) {
		this.titleRepository.deleteById(id);

	}

}

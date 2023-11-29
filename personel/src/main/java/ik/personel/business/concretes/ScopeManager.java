package ik.personel.business.concretes;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import ik.personel.business.abstracts.ScopeService;
import ik.personel.business.requests.scope.CreateScopeRepuest;
import ik.personel.business.requests.scope.UpdateScopeRequest;
import ik.personel.business.responses.scope.GetAllScopeResponse;
import ik.personel.core.utilities.mapper.ModelMapperService;
import ik.personel.dataAccess.abstracts.ScopeRepository;
import ik.personel.entities.concretes.Scope;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ScopeManager implements ScopeService {

	private ModelMapperService modelMapperService;
	private ScopeRepository scopeRepository;

	@Override
	public List<GetAllScopeResponse> getAllScopeResponses() {
		List<Scope> scopes = this.scopeRepository.findAll();
		List<GetAllScopeResponse> getAllScopeResponses = scopes.stream()
				.map(scope -> this.modelMapperService.forResponse().map(scope, GetAllScopeResponse.class))
				.collect(Collectors.toList());
		return getAllScopeResponses;
	}

	@Override
	public void add(CreateScopeRepuest createScopeRepuest) {
		Scope scope=this.modelMapperService.forRequest().map(createScopeRepuest,  Scope.class);
		scope.setId(0);
		this.scopeRepository.save(scope);

	}

	@Override
	public void update(UpdateScopeRequest updateScopeRequest) {
		Scope scope=this.modelMapperService.forRequest().map(updateScopeRequest, Scope.class);
		this.scopeRepository.save(scope);

	}

	@Override
	public void delete(int id) {
		this.scopeRepository.deleteById(id);

	}

}

package ik.personel.business.abstracts;

import java.util.List;

import ik.personel.business.responses.gender.GetAllGenderResponse;

public interface GenderService {

	List<GetAllGenderResponse> getAllGenderResponses();
}

package ik.personel.business.responses.town;

import ik.personel.entities.concretes.City;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllTownResponse {

	private int id;
	private String townName;
	private int cityId;
}

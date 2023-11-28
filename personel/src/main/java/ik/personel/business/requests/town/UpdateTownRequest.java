package ik.personel.business.requests.town;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateTownRequest {

	private int id;
	private String townName;
	private int cityId;
}

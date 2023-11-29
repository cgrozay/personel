package ik.personel.business.responses.gender;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllGenderResponse {

	private int id;
	private String genderName;
}

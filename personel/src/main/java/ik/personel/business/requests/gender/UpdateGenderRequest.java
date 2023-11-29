package ik.personel.business.requests.gender;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateGenderRequest {

	private int id;
	private String genderName;
}

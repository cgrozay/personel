package ik.personel.business.responses.school;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetByIdSchoolResponse {

	private int id;
	private String schoolName;
}

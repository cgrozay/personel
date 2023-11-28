package ik.personel.business.requests.school;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UpdateSchoolRequest {

	private int id;
	private String schoolName;
}

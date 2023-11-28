package ik.personel.business.requests.school;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CreateSchoolRequest {

	private String schoolName;
	//private int departmentId;
}

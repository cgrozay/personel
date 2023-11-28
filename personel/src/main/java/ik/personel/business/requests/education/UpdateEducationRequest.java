package ik.personel.business.requests.education;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateEducationRequest {

	private int id;
	private String educationName;
}

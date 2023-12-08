package ik.personel.business.responses.education;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllEducationResponse {

	private int id;
	private String educationName;
}

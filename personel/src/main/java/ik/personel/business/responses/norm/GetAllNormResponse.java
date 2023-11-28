package ik.personel.business.responses.norm;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllNormResponse {

	private int id;
	private String normName;
}

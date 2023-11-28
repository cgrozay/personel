package ik.personel.business.requests.norm;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateNormRequest {

	private int id;
	private String normName;
}

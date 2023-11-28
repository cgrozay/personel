package ik.personel.business.requests.position;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdatePositionRequest {

	private int id;
	private String positionName;
}

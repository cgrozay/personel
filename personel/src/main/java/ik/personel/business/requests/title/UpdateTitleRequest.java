package ik.personel.business.requests.title;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UpdateTitleRequest {

	private int id;
	private String titleName;
}

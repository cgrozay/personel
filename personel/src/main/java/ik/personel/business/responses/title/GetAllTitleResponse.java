package ik.personel.business.responses.title;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllTitleResponse {

	private int id;
	private String titleName;
}

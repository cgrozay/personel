package ik.personel.business.responses.scope;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllScopeResponse {

	private int id;
	private String scopeName;
}

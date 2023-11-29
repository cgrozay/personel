package ik.personel.business.requests.scope;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateScopeRequest {

	private int id;
	private String scopeName;
}

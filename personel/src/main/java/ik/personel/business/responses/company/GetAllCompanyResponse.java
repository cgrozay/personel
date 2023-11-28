package ik.personel.business.responses.company;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetAllCompanyResponse {

	private int id;
	private String companyName;
	private String companyTitle;
}

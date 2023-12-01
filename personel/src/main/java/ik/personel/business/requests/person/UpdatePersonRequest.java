package ik.personel.business.requests.person;

import java.sql.Date;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdatePersonRequest {

	private int id;
	private String identificationNumber;
	private String nameSurname;
	private Date dateOfBirth;
	private Date dateOfWork;
	private int educationId;
	private int schoolId;
	private int departmentId;
	private int discipline;
	private int companyId;
	private int cityId;
	private int townId;
	private int titleId;
	private int positionId;
	private int normId;
	private int genderId;
}

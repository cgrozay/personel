package ik.personel.business.responses.person;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllPersonsViewResponse {

	private int id;
	private String nameSurname;
	private String identificationNumber;
	private String genderName;
	private Date dateOfBirth;
	private Date dateOfWork;
	private String educationName;
	private String schoolName;
	private String departmentName;
	private int discipline;
	private String scopeName;
	private String companyTitle;
	private String cityName;
	private String townName;
	private String titleName;
	private String positionName;
	private String normName;
}

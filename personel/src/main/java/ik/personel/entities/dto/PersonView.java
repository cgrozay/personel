package ik.personel.entities.dto;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "personview")
@AllArgsConstructor
@NoArgsConstructor
public class PersonView {

	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "namesurname")
	private String nameSurname;
	@Column(name = "identificationnumber")
	private String identificationNumber;
	@Column(name = "gendername")
	private String genderName;
	@Column(name = "dateofbirth")
	private Date dateOfBirth;
	@Column(name ="dateofwork" )
	private Date dateOfWork;
	@Column(name ="educationname")
	private String educationName;
	@Column(name = "schoolname")
	private String schoolName;
	@Column(name = "departmentname")
	private String departmentName;
	@Column(name = "discipline")
	private int discipline;
	@Column(name = "scopename")
	private String scopeName;
	@Column(name = "companytitle")
	private String companyTitle;
	@Column(name = "cityname")
	private String cityName;
	@Column(name = "townname")
	private String townName;
	@Column(name ="titlename" )
	private String titleName;
	@Column(name = "positionname")
	private String positionName;
	@Column(name = "normname")
	private String normName;
	@Column(name = "normid")
	private int normId;
}

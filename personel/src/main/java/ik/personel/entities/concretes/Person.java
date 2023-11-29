package ik.personel.entities.concretes;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "persons")
@AllArgsConstructor
@NoArgsConstructor
public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@Column(name = "identificationnumber")
	private String identificationNumber;
	@Column(name = "namesurname")
	private String nameSurname;
	@Column(name = "dateofbirth")
	private Date dateOfBirth;
	@Column(name = "dateofwork")
	private Date dateOfWork;
	@ManyToOne
	@JoinColumn(name = "educationstatusid")
	private Education education;
	@ManyToOne
	@JoinColumn(name = "schoolid")
	private School school;
	@ManyToOne
	@JoinColumn(name = "departmentid")
	private Department department;
	@Column(name = "discipline")
	private int discipline;
	@ManyToOne
	@JoinColumn(name = "scopestatus")
	private Scope scope;
	@ManyToOne
	@JoinColumn(name = "companyid")
	private Company company;
	@ManyToOne
	@JoinColumn(name = "cityid")
	private City city;
	@ManyToOne
	@JoinColumn(name = "townid")
	private Town town;
	@ManyToOne
	@JoinColumn(name = "titleid")
	private Title title;
	@ManyToOne
	@JoinColumn(name = "positionid")
	private Position position;
	@ManyToOne
	@JoinColumn(name = "normid")
	private Norm norm;
	@ManyToOne
	@JoinColumn(name = "genderid")
	private Gender gender;
	
}

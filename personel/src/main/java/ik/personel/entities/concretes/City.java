package ik.personel.entities.concretes;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
@Table(name = "cities")
@AllArgsConstructor
@NoArgsConstructor
public class City {

	@Id()
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@Column(name = "cityname")
	private String cityName;
	@OneToMany(mappedBy = "city")
	List<Town> towns;
	@OneToMany(mappedBy = "city")
	List<Person> persons;
}

package ik.personel.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import ik.personel.entities.concretes.City;

public interface CityRepository extends JpaRepository<City, Integer>{

}

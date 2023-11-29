package ik.personel.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import ik.personel.entities.concretes.Person;

public interface PersonRepository extends JpaRepository<Person, Integer>{

}

package ik.personel.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import ik.personel.entities.concretes.Gender;

public interface GenderRepository extends JpaRepository<Gender, Integer>{

}

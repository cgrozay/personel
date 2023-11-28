package ik.personel.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import ik.personel.entities.concretes.Town;

public interface TownRepository extends JpaRepository<Town, Integer>{

}

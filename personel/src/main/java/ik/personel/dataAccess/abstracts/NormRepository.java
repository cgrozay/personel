package ik.personel.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import ik.personel.entities.concretes.Norm;

public interface NormRepository extends JpaRepository<Norm, Integer>{

}

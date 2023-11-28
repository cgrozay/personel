package ik.personel.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import ik.personel.entities.concretes.Position;

public interface PositionRepository extends JpaRepository<Position, Integer>{

}

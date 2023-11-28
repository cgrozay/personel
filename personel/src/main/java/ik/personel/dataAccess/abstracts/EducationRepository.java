package ik.personel.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import ik.personel.entities.concretes.Education;

public interface EducationRepository extends JpaRepository<Education, Integer>{

}

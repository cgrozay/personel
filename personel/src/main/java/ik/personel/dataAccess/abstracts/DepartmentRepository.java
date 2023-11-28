package ik.personel.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import ik.personel.entities.concretes.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer>{

}

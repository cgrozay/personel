package ik.personel.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import ik.personel.entities.concretes.School;

public interface SchoolsRepository extends JpaRepository<School, Integer>{

	//@Query("From School where department.id=:departmentId")
	//List<School> findByDepartment(int departmentId);
}

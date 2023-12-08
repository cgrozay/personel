package ik.personel.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import ik.personel.entities.dto.PersonView;

public interface PersonViewRepository extends JpaRepository<PersonView, Integer>{

	@Query("From PersonView where normId=:normId")
	List<PersonView> findByNormId(int normId );
	@Query("From PersonView where companyTitle=:companyTitle and cityName=:cityName and townName=:townName")
	List<PersonView> findByCompanyAndCityAndTown(String companyTitle,String cityName,String townName);
	//@Query("From School where department.id=:departmentId")
//	List<School> findByDepartment(int departmentId);
}

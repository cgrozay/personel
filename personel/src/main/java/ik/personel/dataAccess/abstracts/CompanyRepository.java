package ik.personel.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import ik.personel.entities.concretes.Company;

public interface CompanyRepository extends JpaRepository<Company, Integer>{

}

package ik.personel.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import ik.personel.entities.concretes.Scope;

public interface ScopeRepository extends JpaRepository<Scope, Integer>{

}

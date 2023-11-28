package ik.personel.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import ik.personel.entities.concretes.Title;

public interface TitleRepository extends JpaRepository<Title, Integer>{

}

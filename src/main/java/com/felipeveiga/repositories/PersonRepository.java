package com.felipeveiga.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.felipeveiga.domain.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long>{

}

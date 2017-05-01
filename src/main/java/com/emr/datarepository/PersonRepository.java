package com.emr.datarepository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.emr.model.Person;

@Repository
public interface PersonRepository extends CrudRepository<Person, Long> {

    Person findBySsn(String ssn);

    List<Person> findByName(String name);

}

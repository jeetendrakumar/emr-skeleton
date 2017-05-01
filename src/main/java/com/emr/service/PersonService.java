package com.emr.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emr.datarepository.PersonRepository;
import com.emr.model.Person;

@Service
public class PersonService {
    
    @Autowired
    private PersonRepository personRepository;
    
    public Person createOrUpdatePerson(Person person) {
        return personRepository.save(person);
    }
      
    public Person getPerson(long personId) {
        return personRepository.findOne(personId);
    }

    public List<Person> getPersons() {
        List<Person> personList = new ArrayList<>();
        personRepository.findAll().forEach(personList::add);
        return personList;
    }

    public void deletePerson(long personId) {
        personRepository.delete(personId);;
    }
}

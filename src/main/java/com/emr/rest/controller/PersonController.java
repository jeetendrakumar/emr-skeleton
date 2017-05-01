package com.emr.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.emr.model.Person;
import com.emr.service.PersonService;

@RestController
@RequestMapping("/emr/api/v1_0")
public class PersonController {

    @Autowired
    private PersonService personService;

    @RequestMapping(value = "/person/{personId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Person getPerson(@PathVariable("personId") final long personId) {
        return personService.getPerson(personId);
    }

    @RequestMapping(value = "/person", method = RequestMethod.POST)
    public void createPerson(@RequestBody Person person) {
        personService.createOrUpdatePerson(person);
    }
    
    @RequestMapping(value = "/persons", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Person> getPersons() {
        return personService.getPersons();
    }
    
    @RequestMapping(value = "/person/{personId}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
    public Person updatePerson(@PathVariable("personId") final long personId, @RequestBody Person person) {
        return personService.createOrUpdatePerson(person);
    }
    
    @RequestMapping(value = "/person/{personId}", method = RequestMethod.DELETE)
    public void deletePerson(@PathVariable("personId") final long personId) {
        personService.deletePerson(personId);
    }

}

package com.emr.service;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PersonServiceTest {
    
    PersonService personService;
    

    @Before
    public void setUp() throws Exception {
        personService = new PersonService();
    }

    @Test
    public final void testCreatePerson() {
    }

    @Test
    public final void testGetPerson() {
        assertNotNull(personService.getPerson(12));
    }

}

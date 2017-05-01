package com.emr.service;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Matchers.anyLong;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import com.emr.datarepository.PersonRepository;
import com.emr.model.Person;

@RunWith(PowerMockRunner.class)
@PrepareForTest(PersonService.class)
public class PersonServiceTest {
    
    @Mock
    private PersonRepository personRepository;
    
    @InjectMocks
    PersonService personService;
    
    @Before
    public void setup() throws Exception {
        personService = new PersonService();
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public final void testCreatePerson() {
    }

    @Test
    public final void testGetPerson() {
        Person person = new Person();
        when(personRepository.findOne(anyLong())).thenReturn(person);
        assertNotNull(personService.getPerson(12l));
    }

}

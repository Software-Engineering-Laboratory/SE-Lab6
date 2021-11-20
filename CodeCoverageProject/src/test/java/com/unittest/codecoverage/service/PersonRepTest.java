package com.unittest.codecoverage.service;

import com.unittest.codecoverage.models.Person;
import com.unittest.codecoverage.repositories.PersonRepository;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PersonRepTest {

    @Test
    public void insetTestPersonNull(){
        PersonRepository personRepository = new PersonRepository();
        Exception exception = assertThrows(NullPointerException.class, () -> {
            Person person1 =personRepository.insert(null);        });
        String realMessage =  "person can't be null" ;
        String gotMessage = exception.getMessage();
        assertEquals(realMessage, gotMessage);

    }


    @Test
    public void updateTestPersonNull(){
        PersonRepository personRepository = new PersonRepository();
        Exception exception = assertThrows(NullPointerException.class, () -> {
            personRepository.update(null);        });
        String realMessage =  "person can't be null" ;
        String gotMessage = exception.getMessage();
        assertEquals(realMessage, gotMessage);

    }
    @Test
    public void DeleteTestPersonNull(){
        PersonRepository personRepository = new PersonRepository();
        Exception exception = assertThrows(NullPointerException.class, () -> {
            personRepository.delete(null);        });
        String realMessage =  "name can't be null" ;
        String gotMessage = exception.getMessage();
        assertEquals(realMessage, gotMessage);

    }

    @Test
    public void getTestPersonNull(){
        PersonRepository personRepository = new PersonRepository();
        Exception exception = assertThrows(NullPointerException.class, () -> {
            Person person = personRepository.get(null);        });
        String realMessage =  "name can't be null" ;
        String gotMessage = exception.getMessage();
        assertEquals(realMessage, gotMessage);

    }
}

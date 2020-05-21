package com.example.tddapp.mockito;

import com.example.tddapp.Person;

import org.junit.Test;
import static org.junit.Assert.*;


import static org.mockito.Mockito.mock;

public class MockitoTest {

    @Test
    public void testPersonIsNotNull(){
        // fist way to mock object
        Person person = mock(Person.class);
        assertNotNull(person);
    }

}

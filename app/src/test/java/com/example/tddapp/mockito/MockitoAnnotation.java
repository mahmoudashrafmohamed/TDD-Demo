package com.example.tddapp.mockito;

import com.example.tddapp.Person;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;

public class MockitoAnnotation {
    @Mock
    Person person;

    @Before
    public void setup(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testPersonIsNotNull(){
        // second way to mock object
        assertNotNull(person);
    }
}

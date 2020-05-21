package com.example.tddapp.mockito;

import com.example.tddapp.Person;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertNotNull;

// third way to mock object
@RunWith(MockitoJUnitRunner.class)
public class MockitoJunitRunnerTest {
    @Mock
    Person person;


    @Test
    public void testPersonIsNotNull(){
        assertNotNull(person);
    }
}

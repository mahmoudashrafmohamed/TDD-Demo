package com.example.tddapp.mockito.stubtest;

import com.example.tddapp.Person;

import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class MockitoStubTest {
    // we want to simulate return value from mocking object instead default values
    @Mock
    Person person;

    // fourth way to mock object by rule
    @Rule
    public MockitoRule rule = MockitoJUnit.rule();

    @Test
    public void testPersonIsNotNull(){
        assertNotNull(person);
    }

    @Test
    public void testPersonFullNameReturnApi(){
        System.out.println(person.getAge());
        System.out.println(person.getFullName());
        when(person.getAge()).thenReturn(27);
        when(person.getFullName()).thenReturn("mahmoud");
        System.out.println(person.getAge());
        System.out.println(person.getFullName());
    }


    @Test
    public void testPersonFullNameThrowException(){
        when(person.getFullName()).thenThrow(new IllegalStateException("Test then throw exception."));
    }

    // verify mockito
    @Test
    public void testVerifyTimes(){
       person.getAge();
       person.getAge();
       verify(person,times(2)).getAge();
    }

}

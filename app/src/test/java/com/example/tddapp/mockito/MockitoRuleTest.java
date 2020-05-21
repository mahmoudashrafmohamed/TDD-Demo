package com.example.tddapp.mockito;

import com.example.tddapp.Person;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.MockitoRule;

import static org.junit.Assert.assertNotNull;

public class MockitoRuleTest {
    @Mock
    Person person;

    // fourth way to mock object by rule
    @Rule
    public MockitoRule rule = MockitoJUnit.rule();

    @Test
    public void testPersonIsNotNull(){
        assertNotNull(person);
    }
}

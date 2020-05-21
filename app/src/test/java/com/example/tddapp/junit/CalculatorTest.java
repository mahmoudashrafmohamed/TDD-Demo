package com.example.tddapp.junit;

import com.example.tddapp.Calculator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;


public class CalculatorTest {

    Calculator calculator;

    // this method is called once only before all test cases and must be static method
    @BeforeClass
    public static void init(){
     System.out.println("@Before class");
    }

    // this fun is called before every test case
    @Before
    public void setup(){
         calculator = new Calculator();
    }

    //add test case
    @Test
    public void testAddTwoNumbers() {
        assertEquals(5, calculator.add(2,3));
    }

    //subtract test case
    @Test
    public void testSubtractTwoNumbers() {
        assertEquals(2, calculator.subtract(4,2));
    }

    @Test
    public void testMultiplyTwoNumbers() {
        assertEquals(4, calculator.multiply(2,2));
    }

    @Test
    public void testDivideByNonZeroNumber() {
        assertEquals(3, calculator.divide(9,3));
    }

    // you can also handle it by @Ignore for exception
    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZeroNumber() {
        assertEquals(3, calculator.divide(9,0));
    }

    // this fun is called after every test case
    @After
    public void teardown(){
        calculator = null;
    }

    // this method is called once only After all test cases and must be static method
    @AfterClass
    public static void close(){
        System.out.println("@After class");
    }

}
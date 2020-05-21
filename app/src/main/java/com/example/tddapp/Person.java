package com.example.tddapp;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public String getFullName(){
        return firstName + " " + lastName;
    }

    public int getAge(){
        return age;
    }
}

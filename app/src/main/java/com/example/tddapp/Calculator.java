package com.example.tddapp;

public class Calculator {
    public int add(int a, int b) {
        return a+b;
    }

    public int subtract(int a, int b) {
    return a-b;
    }

    public int multiply(int a, int b) {
        return a*b;
    }

    public int divide(int a, int b) {
        if (b==0) throw new IllegalArgumentException("can not divide by zero number");
        return a/b;
    }
}

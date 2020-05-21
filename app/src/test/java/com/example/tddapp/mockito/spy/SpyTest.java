package com.example.tddapp.mockito.spy;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.LinkedList;
import java.util.List;

public class SpyTest {

    // use spy if you want to return real value not fake value
    // spy called partial mock
    @Test
    public void testSpy(){
        List list = new LinkedList();
        List spy = Mockito.spy(list);
        spy.add("one");
        spy.add("two");
        spy.add("three");

        System.out.println(spy.get(0));

    }
}

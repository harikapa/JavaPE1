package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenOrOddTest {

    EvenOrOdd evenOrOdd;

    @Before
    public void setUp()
    {
        evenOrOdd = new EvenOrOdd();
    }

    @After
    public void tearDown()
    {
        evenOrOdd = null;
    }

    @Test
    public void givenNumberShouldReturnJerry()
    {
        String result = evenOrOdd.IsEven(24);

        assertEquals("Jerry", result);
    }

    @Test
    public void givenNumberShouldReturnTom()
    {
        String result = evenOrOdd.IsEven(25);

        assertEquals("Tom", result);
    }

    @Test
    public void givenNumberShouldReturnNull()
    {
        String result = evenOrOdd.IsEven(15);

        assertEquals(null, result);
    }
}
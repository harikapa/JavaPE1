package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenOrOddCheckerTest {

    EvenOrOddChecker evenOrOddChecker;

    @Before
    public void setUp()
    {
        evenOrOddChecker = new EvenOrOddChecker();
    }

    @After
    public void tearDown()
    {
        evenOrOddChecker = null;
    }

    @Test
    public void givenEvenNumberShouldReturnJerry()
    {
        String result = evenOrOddChecker.IsEven(24);

        assertEquals("Jerry", result);
    }

    @Test
    public void givenOddNumberShouldReturnTom()
    {
        String result = evenOrOddChecker.IsEven(25);

        assertEquals("Tom", result);
    }

    @Test
    public void givenSmallNumberShouldReturnNull()
    {
        String result = evenOrOddChecker.IsEven(15);

        assertNotNull("given number is not between 20 and 30", result);
    }

    @Test
    public void givenNegativeNumberShouldReturnNull()
    {
        String result = evenOrOddChecker.IsEven(-15);

        assertEquals("given number is not between 20 and 30", result);
    }

    @Test
    public void givenEvenNegativeNumberShouldReturnNull()
    {
        String result = evenOrOddChecker.IsEven(-34);

        assertNotNull("given number is not between 20 and 30", result);
    }
}
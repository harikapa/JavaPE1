package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SumOfIntArgumentsTest {

    SumOfIntArguments sumOfIntArguments;

    @Before
    public void setUp()
    {
        sumOfIntArguments = new SumOfIntArguments();
    }

    @After
    public void tearDown()
    {
        sumOfIntArguments = null;
    }

    @Test
    public void givenStringShouldReturnIntSum()
    {
        String result = sumOfIntArguments.getSumOfArguments("1 2 3 4 5");

        assertEquals("15", result);
    }

    @Test
    public void givenStringWithNegativenumbersShouldReturnIntSum()
    {
        String result = sumOfIntArguments.getSumOfArguments("1 2 3 4 -5");

        assertEquals("5", result);
    }

    @Test
    public void givenStringWithLongIntShouldReturnErrorMessge()
    {
        String result = sumOfIntArguments.getSumOfArguments("1 2 3 3454565765 -5");

        assertEquals("Please Enter all the integers", result);
    }

    @Test
    public void givenStringWithoutIntegersShouldReturnErrorMessge()
    {
        String result = sumOfIntArguments.getSumOfArguments("harika");

        assertEquals("Please Enter all the integers", result);
    }
}
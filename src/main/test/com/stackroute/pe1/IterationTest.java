package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IterationTest {


    NumberIteration iteration;

    @Before
    public void setUp()
    {
        iteration = new NumberIteration();
    }

    @After
    public void tearDown()
    {
        iteration = null;
    }

    @Test
    public void givenNumberShouldReturnIterativeString()
    {
        String result = iteration.iterativePrint(5);

        assertEquals("1 2 2 3 3 3 4 4 4 4 5 5 5 5 5", result);
    }

    @Test
    public void givenZeroShouldReturnEmptyString()
    {
        String result = iteration.iterativePrint(0);

        assertEquals("", result);
    }

    @Test
    public void givenNegativeNumberShouldReturnEmptyString()
    {
        String result = iteration.iterativePrint(-2);

        assertEquals("", result);
    }




}
package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumberSortingTest {

    NumberSorting numberSorting;

    @Before
    public void setUp()
    {
        numberSorting = new NumberSorting();
    }

    @After
    public void tearDown()
    {
        numberSorting = null;
    }

    @Test
    public void givenNumberShouldReturnSortedNumber()
    {
        numberSorting.sort(5356);

        assertEquals("NumberSorting{sortedNumber=6553, evenSum=6, isSumAboveLimit=false}",numberSorting.toString());
    }

    @Test
    public void givenNegativeNumberShouldReturnSortedNumber() {

        numberSorting.sort(-2456788);

        assertEquals("NumberSorting{sortedNumber=-8876542, evenSum=28, isSumAboveLimit=true}", numberSorting.toString());
    }

    @Test
    public void givenZeroShouldReturnSortedNumber() {

        numberSorting.sort(0);

        assertEquals("NumberSorting{sortedNumber=0, evenSum=0, isSumAboveLimit=false}", numberSorting.toString());
    }










    }
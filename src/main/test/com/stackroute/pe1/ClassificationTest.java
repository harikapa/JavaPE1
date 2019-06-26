package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ClassificationTest {

    Classification classification;

    @Before
    public void setUp()
    {
        classification = new Classification();
    }

    @After
    public void tearDown()
    {
        classification = null;
    }

    @Test
    public void givenCharShouldReturnSmallLetter()
    {
        String result = classification.getCharType('a');

        assertEquals("Small letter", result);
    }

    @Test
    public void givenCharShouldReturnCapitalLetter()
    {
        String result = classification.getCharType('P');

        assertEquals("Capital letter", result);
    }

    @Test
    public void givenCharShouldReturnSpecialCharacter()
    {
        String result = classification.getCharType('*');

        assertEquals("Special character", result);
    }

    @Test
    public void givenCharShouldReturnDigit()
    {
        String result = classification.getCharType('0');

        assertEquals("Digit", result);
    }
}
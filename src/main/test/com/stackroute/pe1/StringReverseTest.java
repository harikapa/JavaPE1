package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringReverseTest {

    private StringReverse stringReverse;
    @Before
    public void setUp()
    {
        stringReverse = new StringReverse();
    }

    @After
    public void tearDown()
    {
        stringReverse = null;
    }

    @Test
    public void givenStringShouldReturnStringReverse()
    {
        String result = stringReverse.reverse("Harika");

        assertEquals("akiraH", result);
    }

    @Test
    public void givenNullShouldReturnErrorMessage()
    {
        String result = stringReverse.reverse(null);

        assertEquals("Enter proper string", result);
    }

    @Test
    public void givenEmptyStringShouldReturnEmptyString()
    {
        String result = stringReverse.reverse("");

        assertEquals("", result);
    }

    @Test
    public void givenLongStringShouldReturnStringReverse()
    {
        String result = stringReverse.reverse("St@ck R0ute");

        assertEquals("etu0R kc@tS", result);
    }
}
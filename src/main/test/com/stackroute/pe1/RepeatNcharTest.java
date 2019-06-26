package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RepeatNcharTest {

    private RepeatNchar repeatNchar;
    @Before
    public void setUp()
    {
        repeatNchar = new RepeatNchar();
    }

    @After
    public void tearDown()
    {
        repeatNchar = null;
    }

    @Test
    public void givenStringShouldReturnRepeatedString()
    {
        String result = repeatNchar.repeatLastNChar("StackRouter",3);

        assertEquals("StackRouterterterter", result);
    }

    @Test
    public void givenNullShouldReturnErrorMessage()
    {
        String result = repeatNchar.repeatLastNChar(null,3);

        assertEquals("Enter Proper String", result);
    }

    @Test
    public void givenEmptyStringShouldReturnErrorMessage()
    {
        String result = repeatNchar.repeatLastNChar("",3);

        assertEquals("Enter Proper String", result);
    }
}
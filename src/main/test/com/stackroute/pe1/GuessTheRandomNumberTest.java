package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GuessTheRandomNumberTest {

    GuessTheRandomNumber guessTheRandomNumber;

    @Before
    public void setUp()
    {
        guessTheRandomNumber = new GuessTheRandomNumber();
    }

    @After
    public void tearDown()
    {
        guessTheRandomNumber = null;
    }

    @Test
    public void givenNumberShouldReturnNumberIsGreaterMessage()
    {
        String result = guessTheRandomNumber.playguessingGame(25, 34);

        assertEquals("Number Guessed is more then the original number", result);
    }

    @Test
    public void givenNumberShouldReturnNumberIsLesserMessage()
    {
        String result = guessTheRandomNumber.playguessingGame(25, 21);

        assertEquals("Number Guessed is less then the original number", result);
    }

    @Test
    public void givenNumberShouldReturnNumberIsMatchedMessage()
    {
        String result = guessTheRandomNumber.playguessingGame(43, 43);

        assertEquals("Number Guessed matches the original number", result);
    }

    @Test
    public void givenNegativeNumberShouldReturnErrorMessage()
    {
        String result = guessTheRandomNumber.playguessingGame(25, -21);

        assertEquals("Please enter number between 1 to 50", result);
    }

}
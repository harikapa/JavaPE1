package com.stackroute.pe1;

import org.junit.*;

import static org.junit.Assert.*;

public class PalindromeCheckerTest {

    PalindromeChecker palindromeChecker;

    @Before
    public void setUp()
    {
        palindromeChecker = new PalindromeChecker();
    }

    @After
    public void tearDown()
    {
        palindromeChecker = null;
    }

    @Test
    public void givenNumberShouldReturnPalindromeMessage()
    {
        String result = palindromeChecker.checkPalindromeAndGetEvenSum(2468642);

        assertEquals("2468642 is palindrome and the sum of even numbers is greater than 25", result);
    }

    @Test
    public void givenNumberShouldReturnNotAPalindromeMessage()
    {
        String result = palindromeChecker.checkPalindromeAndGetEvenSum(12345);

        assertEquals("12345 is not palindrome", result);
    }

    @Test
    public void givenNumberShouldReturnPalindromeMessageAndSumLessThan25()
    {
        String result = palindromeChecker.checkPalindromeAndGetEvenSum(123321);

        assertEquals("123321 is palindrome and sum of even numbers is less than 25", result);
    }

}
package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VowelOrConsonantTest {

    VowelOrConsonant vowelOrConsonant;

    @Before
    public void setUp()
    {
        vowelOrConsonant = new VowelOrConsonant();
    }

    @After
    public void tearDown()
    {
        vowelOrConsonant = null;
    }

    @Test
    public void givenStringShouldReturnVowel()
    {
        String result = vowelOrConsonant.getLetterByLetterVowelOrConsonant("a");

        assertEquals("Vowel", result);
    }

    @Test
    public void givenStringShouldReturnConsonant()
    {
        String result = vowelOrConsonant.getLetterByLetterVowelOrConsonant("p");

        assertEquals("Consonant", result);
    }

    @Test
    public void givenStringShouldReturnSpecifications()
    {
        String result = vowelOrConsonant.getLetterByLetterVowelOrConsonant("ap");

        assertEquals("Vowel Consonant", result);
    }

    @Test
    public void givenStringShouldReturnNullForSpecialCharacters()
    {
        String result = vowelOrConsonant.getLetterByLetterVowelOrConsonant("a@p");

        assertEquals("Vowel Consonant", result);
    }

    @Test
    public void givenStringShouldReturnProperSpecification()
    {
        String result = vowelOrConsonant.getLetterByLetterVowelOrConsonant("bcu");

        assertEquals("Consonant Consonant Vowel", result);
    }

}
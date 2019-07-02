package com.stackroute.pe1;

//Write a program that takes a character from the user as input and determines whether the
//character entered is a capital letter, a small case letter, a digit or a special symbol and display
//appropriately.

public class Classification {

    public String getCharType(char character)
    {
        String charType;

        if(Character.isLowerCase(character))
        {
            charType = "Small letter";
        }
        else if(Character.isUpperCase(character))
        {
            charType = "Capital letter";
        }
        else if(Character.isDigit(character))
        {
            charType = "Digit";
        }
        else
        {
            charType = "Special character";
        }

        return charType;
    }
}

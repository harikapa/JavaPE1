package com.stackroute.pe1;

public class Classification {

    public String getCharType(char character)
    {
        if((character >= 'a' && character <= 'z') || (character >= 'A' && character <= 'Z'))
        {
            if(character >= 'a')
            return "Small letter";
            else
                return "Capital letter";
        }
        else if(character >= '0' && character <= '9')
        {
            return "Digit";
        }
        else
        {
            return "Special character";
        }
    }
}

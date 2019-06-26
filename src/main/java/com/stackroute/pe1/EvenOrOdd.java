package com.stackroute.pe1;

public class EvenOrOdd {

    public String IsEven(int number)
    {
        String result = null;
        if(number % 2 == 0 && (number > 20 && number < 30))
        {
            result = "Jerry";
        }
        else if(number % 2 != 0 && (number > 20 && number < 30))
        {
            result = "Tom";
        }
        return result;
    }
}

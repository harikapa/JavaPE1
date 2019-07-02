package com.stackroute.pe1;

//Write a program which accepts an integer number as input from the user and perform the
//following conditional checks:
//a. Print Tom if number is odd and exists between 20 to 30
//b. Print Jerry, if number is even and exists between 20 and 30

public class EvenOrOddChecker {

    public String IsEven(int number)
    {
        String result;

        if(number % 2 == 0 && (number > 20 && number < 30))
        {
            result = "Jerry";
        }
        else if(number % 2 != 0 && (number > 20 && number < 30))
        {
            result = "Tom";
        }
        else {
            result = "given number is not between 20 and 30";
        }
        return result;
    }
}

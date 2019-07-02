package com.stackroute.pe1;

//Write a program using a loop to print the following output. 1 2 2 3 3 3 4 4 4 4 5 5 5 5 5 6 6 6 6
//6 6 . . . nth iteration.

public class NumberIteration {

    public String iterativePrint(int number){

        String result = "";

        for(int i=1; i<=number; i++) // to iterate till number
        {
            for(int j=1; j<=i; j++) // to iterate specified number of times
            {
                result = result.concat(" " + i);
            }
        }
        return result.trim();
    }
}

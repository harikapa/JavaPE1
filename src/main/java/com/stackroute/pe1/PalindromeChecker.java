package com.stackroute.pe1;

//Write a program which accepts a number as input and check whether the given number is
//palindrome or not If it is a palindrome then
//a. Add all the even numbers and check whether the sum is more than 25.
//b. Print success and failure messages for all 3 conditions

public class PalindromeChecker {

    public String checkPalindromeAndGetEvenSum(long number) {
        boolean isNegative = false;
        if(number < 0)
        {
            isNegative = true;
            number = Math.abs(number);
        }
        long temp = Math.abs(number);
        int remainder;
        int reverse = 0;
        String message;
        int sum;

        for(sum = 0; number > 0; number /= 10) {
            remainder = (int)number % 10;
            reverse = reverse * 10 + remainder;

            if (remainder % 2 == 0) {  // To get only even numbers
                sum += remainder;
            }
        }

        if(isNegative)
        {
            reverse = -reverse;
            temp = -temp;
        }

        if (reverse == temp) {  //palindrome condition
            if (sum > 25) {
                message =  temp + " is palindrome and the sum of even numbers is greater than 25";
            } else {
                message = temp + " is palindrome and sum of even numbers is less than 25";
            }
        } else {
            message = temp + " is not palindrome";
        }

        return message;
    }
}

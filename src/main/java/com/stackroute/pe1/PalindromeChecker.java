package com.stackroute.pe1;

public class PalindromeChecker {

    public String checkPalindromeAndGetEvenSum(long number) {
        long temp = number;
        int rem = 0;
        int rev = 0;

        int sum;
        for(sum = 0; number > 0; number /= 10) {
            rem = (int)number % 10;
            rev = rev * 10 + rem;
            if (rem % 2 == 0) {
                sum += rem;
            }
        }

        if (rev == temp) {
            if (sum > 25) {
                return temp + " is palindrome and the sum of even numbers is greater than 25";
            } else {
                return temp + " is palindrome and sum of even numbers is less than 25";
            }
        } else {
            return temp + " is not palindrome";
        }
    }
}

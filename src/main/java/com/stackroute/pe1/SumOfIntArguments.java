package com.stackroute.pe1;

//Write a program that reads an unspecified number of integer arguments using Scanner Class
//and adds them together. The program should display total of the given input number and should
//only consider integer value.The program should display an error message if there are any non
//integer values

public class SumOfIntArguments {

    public String getSumOfArguments(String numbers)
    {
        int sum = 0;
        String[] arr= numbers.split(" ");
        int[] intarr=new int[arr.length];

        for(int i=0;i<arr.length;i++) {
            try {
                intarr[i] = Integer.parseInt(arr[i]); // returns an exception if element is not an integer
            }
            catch (Exception e)
            {
                return "Please Enter all the integers";
            }
            sum = sum + intarr[i];
        }

        return sum + "";
    }
}

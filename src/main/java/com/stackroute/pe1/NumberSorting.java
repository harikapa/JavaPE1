package com.stackroute.pe1;

//Write a program which accepts a number as input from user and perform the following:
//a. sort the number in non-increasing order
//b. after sorting sum all the even numbers, the sum should be greater than 15 .
//c. if sum is more than 15,then print output as true or false

public class NumberSorting {

    int sortedNumber;
    int evenSum;
    boolean isSumAboveLimit;

    @Override
    public String toString() {
        return "NumberSorting{" +
                "sortedNumber=" + sortedNumber +
                ", evenSum=" + evenSum +
                ", isSumAboveLimit=" + isSumAboveLimit +
                '}';
    }

    public int sort(int number) {

        int tempnumber = number;
        number = Math.abs(number); //to handle negative numbers
        int temp = number;
        int count = 0;
        int sum = 0;
        int sortednumber = 0;
        while (number > 0) //to get array length and evenSum
        {
            int remainder = number % 10;
            count++;
            number = number / 10;
            if (remainder % 2 == 0)
                sum = sum + remainder;
        }

        int intArr[] = new int[count];
        for (int i = 0; temp > 0; i++) // intializing individual digits into an array
        {
            intArr[i] = temp % 10;
            temp = temp / 10;
        }

        for (int i = 0; i < count; i++) // sorting array elements using bubble sort
        {
            for (int j = i; j < count; j++) {
                if (intArr[i] < intArr[j]) {
                    temp = intArr[i];
                    intArr[i] = intArr[j];
                    intArr[j] = temp;
                }
            }
        }

        for (int i = 0; i < count; i++) //converting array to number
        {
            sortednumber = sortednumber * 10 + intArr[i];
        }

        if (tempnumber < 0) {
            sortednumber = -sortednumber;
        }

        this.sortedNumber = sortednumber;
        this.evenSum = sum;
        this.isSumAboveLimit = sum > 15 ? true : false;
        return sortednumber;
    }
}

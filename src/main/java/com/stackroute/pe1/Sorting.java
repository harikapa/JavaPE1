package com.stackroute.pe1;

public class Sorting {

    public class Result {
        String sortedNumber;
        String evenSum;
        boolean isSumAboveLimit;
    }

    public Result sort(int number)
    {
        int tempnumber = number;
        number = Math.abs(number);
        Result result = new Result();
        int temp = number;
        int count = 0;
        int sum = 0;
        int sortednumber = 0;
        while (number > 0) //to get array length and evenSum
        {
            int remainder = number%10;
            count++;
            number = number/10;
            if(remainder % 2 ==0)
                sum = sum + remainder;
        }

        int intArr[]= new int[count];
        for(int i=0; temp > 0; i++)
        {
            intArr[i] = temp%10;
            temp = temp/10;
        }

        for(int i=0; i < count; i++)
        {
            for(int j=i; j < count; j++)
            {
                if(intArr[i] < intArr[j])
                {
                    temp = intArr[i];
                    intArr[i] = intArr[j];
                    intArr[j] = temp;
                }
            }
        }

        for(int i=0; i<count; i++)
        {
            sortednumber = sortednumber*10 + intArr[i];
        }

        if(tempnumber < 0)
        {
            sortednumber = -sortednumber;
        }

        result.sortedNumber = "Sorted number in non-increasing order: " +sortednumber;
        result.evenSum = "Sum of even numbers: "+ sum;
        result.isSumAboveLimit = sum>15? true:false;

        return result;

    }
}

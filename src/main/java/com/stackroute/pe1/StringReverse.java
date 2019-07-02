package com.stackroute.pe1;

//Write a program to reverse any string without using String Buffer

public class StringReverse {

    public String reverse(String word){
        try
        {
            String reverse = "";
            int length = word.length();
            for(int i=length-1; i >= 0; i--)
            {
                reverse += word.charAt(i);
            }
            return reverse;
        }
        catch (Exception exception)
        {
            return "Enter proper string";
        }
    }
}

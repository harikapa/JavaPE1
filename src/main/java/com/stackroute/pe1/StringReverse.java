package com.stackroute.pe1;

public class StringReverse {

    public String reverse(String word){
        try
        {
            String rev = "";
            int length = word.length();
            for(int i=length-1; i >= 0; i--)
            {
                rev += word.charAt(i);
            }
            return rev;
        }
        catch (Exception exception)
        {
            return "Enter proper string";
        }
    }
}

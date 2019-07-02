package com.stackroute.pe1;

//Write a program for the following condition:
//Given 2 inputs , where input1 is string and input 2 is integer value, the last n characters should
//repeat n number of times in the output String

public class RepeatNchar {

    public String repeatLastNChar(String word, int number) {

        try {
            int length = word.length();

            String result = word;

            for (int i = 0; i < number; i++) { //repeat last n characters n times

                result = result.concat(word.substring(length - number, length));
            }
            return result;

        } catch (Exception exception) {

            return "Enter Proper String";

        }
    }
}

package com.stackroute.pe1;

public class RepeatNchar {

    public String repeatLastNChar(String word, int number){

        try {
            int length = word.length();

            String result = word;

            System.out.print(word);

            for (int i = 0; i < number; i++) {
                result = result + word.substring(length - number, length);
            }
            return result;
        }
        catch(Exception exception)
            {
                return "Enter Proper String";
            }
    }
}

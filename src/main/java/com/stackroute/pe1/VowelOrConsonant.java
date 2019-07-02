package com.stackroute.pe1;

//Create a program that accepts a word as input and checks for each single character letter in
//the word whether it is a consonant or vowel.
//Condition:
//a. Print an error message if the input is not a letter
//b. If the input having more than one letter, print the required output
//(Vowel or Consonant) for each letter

public class VowelOrConsonant {

    public String getLetterByLetterVowelOrConsonant(String word)
    {
        String result = "";

        for(int i = 0; i < word.length(); i++)
        {
            char letter = word.charAt(i);

            if(letter =='a'|| letter =='e'||letter=='i'||letter=='o'||letter=='u'||letter=='A'||letter=='E'||letter=='I'||letter=='O'||letter=='U')
            {
                result = result.concat(" Vowel");
            }
            else if((letter >= 'a' && letter <= 'z') || (letter >= 'A' && letter <= 'Z'))  //To check letter is an alphabet
            {
                result = result.concat(" Consonant");
            }
        }

        return result.trim();
    }
}

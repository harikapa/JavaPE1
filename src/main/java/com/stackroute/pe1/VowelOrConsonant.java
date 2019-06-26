package com.stackroute.pe1;

public class VowelOrConsonant {

    public String getLetterByLetterVowelOrConsonant(String word)
    {
        String result = "";

        for(int i = 0; i < word.length(); i++)
        {
            char letter = word.charAt(i);
            if(letter =='a'|| letter =='e'||letter=='i'||letter=='o'||letter=='u'||letter=='A'||letter=='E'||letter=='I'||letter=='O'||letter=='U')
            {
                result += " Vowel";
            }
            else if((letter >= 'a' && letter <= 'z') || (letter >= 'A' && letter <= 'Z'))
            {
                result += " Consonant";
            }
        }

        return result.trim();
    }
}

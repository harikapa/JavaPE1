package com.stackroute.pe1;

public class GuessTheRandomNumber {

    public String playguessingGame(int guessedNumber, int userInput) {
//      Random random = new Random();
//        int number = random.nextInt(50);
//        int userInput = 0;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Start guessing the number between 1 to 50");
//        System.out.println("=========================");
//        while (guessedNumber != userInput) {
//            System.out.println("Enter a number");
            //userInput = scanner.nextInt();
        if(userInput <= 0 || userInput > 50)
        {
            return "Please enter number between 1 to 50";
        }
            if (userInput > guessedNumber) {
                return "Number Guessed is more then the original number";
            } else if (userInput < guessedNumber) {
                return "Number Guessed is less then the original number";
            } else {
                return "Number Guessed matches the original number";
//                break;
            }


        }
    }



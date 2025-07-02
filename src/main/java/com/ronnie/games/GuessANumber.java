package com.ronnie.games;

import java.util.Scanner;

public class GuessANumber {
    
    // main method to run this game by itself for testing
    public static void main(String[] args) {
        playGame();
    }
    
    // method that Main.java will call when integrated
    public static void playGame() {
        try (Scanner scanner = new Scanner(System.in)) {
            // variables
            int input;
            int userGuess;
            int randomNum;
            String results;
            boolean isPlaying = true;

            // prompt for user to guess a number from 1-100
            System.out.println("Hello and welcome to Guess a Number!");
            System.out.print("Guess a number between 1 and 100: ");

            // call method to generate a random number
            randomNum = generateRandomNumber();

            while (isPlaying) { 
                try {
                    // method to get user's guess
                    input = getUserGuess(scanner);

                    // validate user guess
                    userGuess = validateInput(input);
                    
                    // compare numbers
                    results = compareNumbers(userGuess, randomNum);

                    // display results
                    System.out.println(results);

                    // check if they won and break if yes
                    if (randomNum == userGuess){
                        isPlaying = false;
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                    System.out.print("Please try again: ");
                }
            }
        }
    }

    public static int generateRandomNumber(){
        return (int)(Math.random() * 100) + 1;
    }

    public static int getUserGuess(Scanner scanner){
        return scanner.nextInt();
    }

    // check if user's guess is between 1-100
    public static int validateInput(int input) throws Exception {
        if(input > 0 && input <= 100){
            return input;
        } else {
            throw new Exception("Guess must be within 1 and 100. Try again!");
        }
    }

    public static String compareNumbers(int userGuess, int randomNum){
        if (userGuess < randomNum){
            return userGuess + " is too low. Try again!";
        } else if (userGuess > randomNum){
            return userGuess + " is too high. Try again!";
        } else {
            return userGuess + " is correct! You win!";
        }
    }
}

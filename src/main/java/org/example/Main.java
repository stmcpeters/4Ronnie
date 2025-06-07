// packages organize classes - means that Main class belongs to the org.example package 
// must match the folder structure src/main/java/org/example/Main.java
// package org.example;
// import Scanner object to capture user input
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
//        create an intro/title
        System.out.println("=================================");
        System.out.println("                         ");
        System.out.println(" Welcome to Ronnie's Games \uD83D\uDE0E\uD83C\uDFAE");
        System.out.println("                         ");
        System.out.println("=================================");
//        prompt player to enter a name
        System.out.print("Please enter your name to continue: ");
        Scanner scanner = new Scanner(System.in);
        String playerName = scanner.nextLine();
        System.out.println("                         ");
        System.out.println("Welcome " + playerName + " :D");
        System.out.println("                         ");
//        create a list of mini games available to play
        System.out.println("Below are all the games available right now:");
        System.out.println("                         ");
        System.out.println("1 - MadLibs");
        System.out.println("2 - Guess a Number");
        System.out.println("                         ");
//        prompt user to enter a number to pick a game
        System.out.print("Please enter the corresponding number to choose a game: ");
//        collect user input to select game
        byte gameChoice = scanner.nextByte();
//        if user input does not match the games available, print a error message and prompt again
        while (gameChoice != 1 && gameChoice != 2) {
                System.out.print("Try again! Please enter a valid number: ");
                gameChoice = scanner.nextByte();
        }
        System.out.println("                         ");
//       get name of game to put into selected prompt
        switch(gameChoice){
                case 1 -> System.out.println("Great! You've selected MadLibs!");
                case 2 -> System.out.println("Great! You've selected the Guess a Number game!");
                default -> System.out.println("This is a default option");
        }
        }
}
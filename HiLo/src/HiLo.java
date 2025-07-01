import java.util.Scanner;

public class HiLo {
    public static void main(String[] args) throws Exception {
        // variables
        int input = 0;
        int userGuess = 0;
        int randomNum = 0;
        String results;
        boolean isPlaying = true;

        // create new scanner object to hold the user's number
        Scanner scanner = new Scanner(System.in);

        // prompt for user to guess a number from 1-100
        System.out.println("Hello and welcome to HiLo!");
        System.out.print("Please enter a number from 1-100:     ");

        // call method to generate a random number
        randomNum = generateRandomNumber();

        while (isPlaying) { 
            // method to get user's guess
            input = getUserGuess(scanner);

            // validate user guess
            userGuess = validateInput(input);
            
            // compare numbers
            results = compareNumbers(userGuess,randomNum,scanner);

            // display results
            System.out.println(results);

            // check if they won and break if yes
            if (randomNum == userGuess){
                isPlaying = false;
            }
        }
        // close scanner connection when done
        scanner.close();  
    }

    public static int generateRandomNumber(){
        // generate random number using Math library
            // will have to multiply math.random by 101 to get 1-100
            // save number to variable
            // Notes: math.random() returns 0.0 to < 1.0; will have to type cast to int value
        return (int)(Math.random() * 100) + 1;
    }

    public static int getUserGuess(Scanner scanner){
        byte input = scanner.nextByte();
        return input;
    }

    // check if user's guess is between 1-100
    public static int validateInput(int input) throws Exception {
        if(input > 0 && input <= 100){
            return input;
        } else {
            throw new Exception("please enter a valid number");
        }
    }

    public static String compareNumbers(int userGuess, int randomNum, Scanner scanner){
        // compare random number to user's guess
        // display if the number is higher/lower/equal
        // if numbers not equal have user guess until correct -- while loop?
        if (userGuess < randomNum){
            return "your guess is lower. try again!";
        } else if (userGuess > randomNum){
            return "your guess is higher. try again!";
        } else {
            return "you guessed correct! the number was " + userGuess;
        }
    }

}

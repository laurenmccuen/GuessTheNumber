import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int randomNumber = new Random().nextInt(100) + 1;

        System.out.println("Choose a number between 1 and 100, ");
        System.out.println("you will have 6 attempts to guess the number.");


        int guessAttempts = 6;

        for (int i = 0; i < guessAttempts; i++) { //create a loop to iterate through the number of guesses allowed
            System.out.println("Guess the number:");
            int guess = Integer.parseInt(scanner.nextLine());
            if (randomNumber == guess) {
                System.out.println("Congratulations! You guessed the number.");
                System.exit(0);
            } else if ((randomNumber > guess) && i != guessAttempts - 1) {
                System.out.println("The number is greater than " + guess + "." + " You have " + (guessAttempts - 1) + " left.");
            } else if (randomNumber < guess && i != guessAttempts - 1) {
                System.out.println("The number is less than " + guess + "." + " You have " + (guessAttempts - 2) + " left.");
            }
        }
        if (guessAttempts == guessAttempts) {
            System.out.println("You have exhausted " + guessAttempts + " attempts.");
            System.out.println("The correct number was: " + randomNumber);
        }


        // Create a main() method
        // Use the following code to create a random number from 1 to 100:
        // Note: you may have to import the Random class
        // int randomNumber = new Random().nextInt(100) + 1;
        // Create a Scanner object
        // Create a variable to hold the number of guess attempts, example
        // int guessAttempts = 6;
        // While the user has more than 0 guess attempts...
        // Ask the user for a number between 1 and 100
        // If the user's number matches the random number tell the user they guessed correctly!
        // Stop the program using:
        // System.exit(0);
        //take in a guess for the number
        // Otherwise, if the user's number is lower than the random number,
        // tell them they guessed too low
        // Decrease the number of attempts by 1
        // Otherwise, tell the user they guessed too high
        // Decrease the number of attempts by 1
        // Outside the loop, tell the user they have lost and reveal the random number!
        /*
         * Feel free to add any additional rules :)
         */

    }
}

import java.util.Random;
import java.util.Scanner;

public class RandomNumberGuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1; // Generate a random number between 1 and 100
        int attempts = 0;
        boolean hasWon = false;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Random Number Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 100.");
        
        while (!hasWon) {
            System.out.print("Take a guess: ");
            int guess = scanner.nextInt();
            attempts++;

            if (guess == randomNumber) {
                hasWon = true;
            } else if (guess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }
        }

        System.out.println("Congratulations! You guessed the number " + randomNumber + " in " + attempts + " attempts.");
    }
}

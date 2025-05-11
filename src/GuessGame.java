import java.util.Random;
import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numberToGuess = random.nextInt(100) + 1; // 1 to 100
        int guess;
        int attempts = 0;


        System.out.println("🎯 Welcome to the Guess the Number Game!");
        System.out.println("I'm thinking of a number between 1 and 100...");

        do {
            System.out.println("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else if (guess > numberToGuess) {
                System.out.println("Too high! Try again.");
            } else {
                 System.out.printf("🎉 Correct! You guessed it in %d attempts.%n", attempts);
            }

        } while (guess != numberToGuess);

        scanner.close();
    }
}
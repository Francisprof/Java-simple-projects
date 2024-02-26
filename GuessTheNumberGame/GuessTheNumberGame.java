import java.util.Scanner;

public class GuessTheNumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Guess the Number game!");
        System.out.println("I have selected a number between 1 and 100. Try to guess it.");

        // Generate a random number between 1 and 100
        int secretNumber = (int) (Math.random() * 100) + 1;

        int attempts = 0;
        boolean hasGuessedCorrectly = false;

        while (!hasGuessedCorrectly) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            attempts++;

            if (userGuess == secretNumber) {
                hasGuessedCorrectly = true;
                System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
            } else if (userGuess < secretNumber) {
                System.out.println("Try again. The secret number is higher.");
            } else {
                System.out.println("Try again. The secret number is lower.");
            }
        }

        scanner.close();
    }
}


import java.util.Random;
import java.util.Scanner;

public class numberguessinggame {

    private int targetNumber;
    private Scanner scanner;

    public numberguessinggame() {
        Random random = new Random();
        targetNumber = random.nextInt(100) + 1; // Generates a number between 1 and 100
        scanner = new Scanner(System.in);
    }

    public void start() {
        int userGuess = 0;
        int numberOfAttempts = 0;
        boolean hasGuessedCorrectly = false;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a number between 1 and 100.");
        System.out.println("Try to guess it!");

        while (!hasGuessedCorrectly) {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();
            numberOfAttempts++;

            if (userGuess < targetNumber) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > targetNumber) {
                System.out.println("Too high! Try again.");
            } else {
                hasGuessedCorrectly = true;
                System.out.println("Congratulations! You've guessed the number correctly.");
                System.out.println("It took you " + numberOfAttempts + " attempts.");
            }
        }

        scanner.close();
    }

    public static void main(String[] args) {
        numberguessinggame game = new numberguessinggame();
        game.start();
    }
}

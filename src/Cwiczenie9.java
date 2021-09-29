// number guesser

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Cwiczenie9 {

    public static void main(String[] args) {
        numberGuesser();

    }

    static void numberGuesser() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        int playerNumber = 0;
        do {
            System.out.println("Please guess the number: ");
            try {
                playerNumber = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.err.println("Entered value is not an integer. Please enter correct value.");
                numberGuesser();
            }

            if (playerNumber < randomNumber) {
                System.out.println("Your number is too low.");
            } else if (playerNumber > randomNumber) {
                System.out.println("Your number is too high.");
            } else {
                System.out.println("You guessed the number, congratulations!!!");
            }

        } while (randomNumber != playerNumber);

    }
}
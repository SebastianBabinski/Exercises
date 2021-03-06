// Number Guesser pt 2

import java.util.Scanner;

public class NumberGuesserPart2 {

    public static void main(String[] args) {
        NumberGuesserPt2();

    }

    static void NumberGuesserPt2() {
        Scanner scanner = new Scanner(System.in);
        String answer = "";
        int min = 0;
        int max = 1000;
        int counter = 0;

        System.out.println("Welcome to the guesser game. Think about a number and I will guess it in less than 10 moves.");
        System.out.println("Say 'too much' if the number is too big, 'too low' if the number is to low and 'hit' if I guessed the number!");

        do {
            int guessedNumber = ((max - min) / 2) + min;
            System.out.println("Guessing your number is: " + guessedNumber);
            answer = scanner.nextLine();
            switch (answer) {
                case "too much":
                    max = guessedNumber;
                    counter++;
                    break;
                case "too low":
                    min = guessedNumber;
                    counter++;
                    break;
                case "hit":
                    System.out.println("I won!");
                    System.exit(1);
            }
        } while (!(counter == 10));
        System.out.println("I lost :(");
    }
}

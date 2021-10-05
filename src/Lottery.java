// Lotto

import java.util.*;

public class Lottery {

    public static void main(String[] args) {
        LottoGuesser();
    }

    private static boolean isValid(int number) {
        if (number < 1 || number > 49) {
            System.err.println("Enter the number from 1 to 49.");
            return false;
        } else {
            return true;
        }
    }

    static void LottoGuesser() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int[] lottoNumbers = new int[6];
        int[] playerNumbers = new int[6];
        int counter = 0;

        // adding randomly numbers to lotto array
        for (int i = 0; i < lottoNumbers.length; i++) {
            lottoNumbers[i] = random.nextInt(49 - 1) + 1;
        }

        System.out.println("Welcome to lotto!");

        // adding numbers to player array
        for (int i = 0; i < playerNumbers.length; i++) {
            System.out.println("Enter a number " + (i + 1) + ".");
            int number;
            do {
                // checking if input is an integer
                while(!scanner.hasNextInt()) {
                    scanner.next();
                    System.err.println("Please enter a number.");
                }
                number = scanner.nextInt();
                playerNumbers[i] = number;
                // checking if input is in range from 1 to 49
            } while (!isValid(number));
        }

        // comparing two arrays
        for (int lottoNumber : lottoNumbers) {
            for (int playerNumber : playerNumbers) {
                if (lottoNumber == playerNumber) {
                    counter++;
                }
            }
        }
        // printing results
        switch (counter) {
            case 3:
                System.out.println("You hit 3 numbers!");
                break;
            case 4:
                System.out.println("You hit 4 numbers!!");
                break;
            case 5:
                System.out.println("You hit 5 numbers!!!");
                break;
            case 6:
                System.out.println("You hit 6 numbers!!!!");
                break;
            default:
                System.out.println("You won nothing, sorry :(");
                break;
        }

    }
}

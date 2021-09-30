// Lotto

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Cwiczenie10 {

    public static void main(String[] args) {
        LottoGuesser();

    }

    static void LottoGuesser() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int[] lottoNumbers = new int[5];
        int[] playerNumbers = new int[5];
        int insertedNumber = 0;

        for(int i = 0; i < lottoNumbers.length; i++) {
            lottoNumbers[i] = random.nextInt(49-1) + 1;
        }

        System.out.println("Welcome to lotto!");

        for(int i = 0; i < playerNumbers.length; i++ ) {
            insertedNumber = scanner.nextInt();
            if (insertedNumber < 50 && insertedNumber > 0) {
                playerNumbers[i] = insertedNumber;
            } else if (insertedNumber > 49) {
                System.out.println("Your number is too big, enter the number from 1 to 49");
            }
        }

    }
}

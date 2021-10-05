// reversing number

import java.util.Scanner;

public class ReversingNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("Welcome, input the number you want to reverse.");
        while(!scanner.hasNextInt()) {
            scanner.next();
            System.err.println("Please enter a number.");
        }
        number = scanner.nextInt();
        reverse(number);
    }

    static void reverse(int number) {

        int reversedNumber = 0;
        int remainder = 0;

        do {
            remainder = number % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            number = number / 10;
        } while (number > 0);

        System.out.println("Your reversed number is: " + reversedNumber);
    }
}

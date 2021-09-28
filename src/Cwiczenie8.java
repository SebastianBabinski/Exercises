// check if numbers are prime from range X to Y

import java.util.Scanner;

public class Cwiczenie8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the start value: ");
        int start = scanner.nextInt();
        System.out.print("Enter the end value: ");
        int end = scanner.nextInt();

        for (int i = start; i <= end; i ++){
            isPrime(i);
        }

    }
    static void isPrime(int number) {
        int counter = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                counter++;
            }
        }
        if (counter == 2) {
            System.out.println(number + " is prime number");
        } else {
            System.out.println(number + " is not prime number");
        }
    }
}

// check if number is prime number

public class PrimeNumber {

    public static void main(String[] args) {
        isPrime(1);
        isPrime(3);
        isPrime(17);
        isPrime(20);
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

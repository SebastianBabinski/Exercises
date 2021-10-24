public class Factorial {

    public static void main(String[] args) {
        System.out.println(factorialNumber(5));
        factorialNumberIteration(5);
    }

    // recursion
    static int factorialNumber(int number) {
        if(number == 0) {
            return 1;
        }
        return number * factorialNumber(number -1);
    }

    // iteration
    static void factorialNumberIteration(int numberTwo) {
        int factorial = 1;

        for(int i = 1; i <= numberTwo; i++) {
            factorial = factorial * i;
        }
        System.out.println("The factorial of number " + numberTwo + " is " + factorial);

    }
}

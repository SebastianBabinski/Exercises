//Using the Java language, have the function SimpleAdding(num) add up all the numbers from 1 to num.
//For example: if the input is 4 then your program should return 10 because 1 + 2 + 3 + 4 = 10.
//For the test cases, the parameter num will be any number from 1 to 1000.

public class SimpleAddingChallenge {
    public static void main(String[] args) {
        SimpleAdding(4);
    }

    static void SimpleAdding(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}

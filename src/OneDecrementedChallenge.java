/*
Have the function OneDecremented(num).
Count how many times a digit appears that is exactly one less than the previous digit.
For example: if num is 5655984, then your program should return 2 because 5 appears
directly after 6 and 8 appears directly after 9.
The input will always contain at least 1 digit.

Sample test cases:
Input:  56
Output: 0
Input:  9876541110
Output: 6
*/


public class OneDecrementedChallenge {

    public static void main(String[] args) {
        OneDecremented("5655984");

    }

    static int OneDecremented(String number) {
        int current;
        // initializing variable as first digit of the number
        int previous = Character.getNumericValue(number.charAt(0));
        int counter = 0;

        for (int i = 1; i < number.length(); i++) {
            // initializing variable as second digit of the number
            current = Character.getNumericValue(number.charAt(i));
            if (previous - current == 1) {
                counter++;
            }
            previous = current;
        }
        return counter;
    }
}

public class PalindromeInteger {

    public static void main(String[] args) {
        isIntegerPalindrome(505);
        isIntegerPalindrome(21455412);
        isIntegerPalindrome(14);
        isIntegerPalindrome(9475);
    }

    static void isIntegerPalindrome(int number) {
        int palindrome = number;
        int reverse = 0;
        int remainder;

        do {
            // dividing the number to get remainder
            remainder = palindrome % 10;
            // adding remainder to the reversed number
            reverse = reverse * 10 + remainder;
            // dividing palindrome so we can go to the next digit
            palindrome = palindrome / 10;
        } while (palindrome > 0);

        // checking if given number is equal to reversed one
        if (number == reverse) {
            System.out.println(number + " is a palindrome!");
        } else {
            System.out.println(number + " is not a palindrome. ");
        }

    }
}

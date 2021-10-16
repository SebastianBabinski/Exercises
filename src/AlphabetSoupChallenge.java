import java.util.Arrays;
import java.util.Scanner;

/**
 * Have the function AlphabetSoup(str) take the str string parameter being passed and return the string with the letters in alphabetical order (ie. hello becomes ehllo).
 * Assume numbers and punctuation symbols will not be included in the string.
 */

public class AlphabetSoupChallenge {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter word: ");
        AlphabetSoup(scanner.nextLine());
    }

    static void AlphabetSoup(String word) {
        String finalWord;
        char[] chars = word.toCharArray();
        Arrays.sort(chars);
        finalWord = new String(chars);
        System.out.println(finalWord);
    }
}

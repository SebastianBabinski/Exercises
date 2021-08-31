//masz podane 2 stringi, sprawdź czy jeden jest palindromem drugiego

import java.util.Scanner;

public class cwiczenie4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj pierwsze słowo: ");
        String wordOne = scanner.nextLine();
        System.out.print("Podaj drugie słowo: ");
        String wordTwo = scanner.nextLine();
        isPalindrome(wordOne, wordTwo);
    }

    static void isPalindrome(String firstWord, String secondWord) {

        int firstWordlength = firstWord.length();
        int secondWordlength = secondWord.length();

        if (firstWordlength < secondWordlength || firstWordlength > secondWordlength) {
            System.out.println("to nie jest palindrom");
        }
        for (int i = 0; i < firstWordlength; i++) {
            if (firstWord.charAt(i) == secondWord.charAt(firstWordlength - 1 - i)) {
                if(i == firstWordlength - 1) {
                    System.out.println("to jest palindrom");
                }
            } else {
                System.out.println("to nie jest palindrom");
                break;
            }
        }
    }
}

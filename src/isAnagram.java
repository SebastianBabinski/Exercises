import java.util.Arrays;

public class isAnagram {

    public static void main(String[] args) {
        isAnagram("kot", "kto");
        isAnagram("test", "best");

    }

    static void isAnagram(String word, String anagram) {
        char[] wordArray = word.toCharArray();
        char[] anagramArray = anagram.toCharArray();

        Arrays.sort(wordArray);
        Arrays.sort(anagramArray);

        if (Arrays.equals(wordArray, anagramArray)) {
            System.out.println(word + " and " + anagram + " are anagrams.");
        } else {
            System.err.println(word + " and " + anagram + " are not anagrams.");
        }
    }
}

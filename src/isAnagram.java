import java.util.Arrays;

public class isAnagram {

    public static void main(String[] args) {
        isAnagramMethod("kot", "kto");
        isAnagramMethod("test", "best");
    }

    static void isAnagramMethod(String word, String anagram) {
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

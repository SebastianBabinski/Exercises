import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FirstNonRepeatedChar {

    public static void main(String[] args) {
        firstNonRepeatingChar("blablabalbaae");
    }

    public static void firstNonRepeatingChar(String word) {
        // creating hashset and arraylist for repeating chars and not repeating chars
        Set<Character> repeating = new HashSet<>();
        List<Character> notRepeating = new ArrayList<>();

        // iterating through word
        for(int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            if (repeating.contains(letter)) {
                continue;
            }
            if (notRepeating.contains(letter)) {
                // deleting char if there is next similar char in the word and adding it to repeating store
                notRepeating.remove((Character) letter);
                repeating.add(letter);
            } else {
                // adding letter to not repeating store
                notRepeating.add(letter);
            }
        }
        System.out.println("First non-repeating character is: " + notRepeating.get(0));
    }
}

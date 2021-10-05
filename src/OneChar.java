public class OneChar {

    public static void main(String[] args) {
        test("pale", "ple");
        test("pales", "pale");
        test("pale", "bale");
        test("pale", "bake");

    }

    public static boolean test(String word1, String word2) {
        if (word1 == word2) {
            return true;
        } else if (word1.length() == word2.length()) {
            return replace(word1, word2);
        } else if (word1.length() == word2.length() + 1) {
            return insert(word1, word2);
        } else if (word2.length() == word1.length() + 1) {
            return insert(word2, word1);
        }
        return false;
    }

    private static boolean insert(String longer, String shorter) {
        int j = 0;
        boolean inserted = false;
        for (int i = 0; i < shorter.length(); ++i) {
            if (longer.charAt(j) != shorter.charAt(i)) {
                if (inserted) return false;
                else {
                    inserted = true;
                    --i;
                }
            }
            ++j;
        }
        return true;
    }

    private static boolean replace(String str1, String str2) {
        boolean replaced = false;
        for (int i = 0; i <str1.length(); ++i) {
            if(str1.charAt(i) != str2.charAt(i)) {
                if(replaced) return false;
                else {
                    replaced = true;
                }
            }
        }
        return true;
    }
}

public class SimpleSymbolsChallenge {

    public static void main(String[] args) {
        System.out.println(SimpleSymbols("+d+=3=+s+"));
        System.out.println(SimpleSymbols("f++d+"));
        System.out.println(SimpleSymbols("+d+==+s+"));

    }

    static String SimpleSymbols(String str) {

        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i)) && i == 0) return "false";
            if (Character.isLetter(str.charAt(i)) && i == str.length() - 1) return "false";
            if (Character.isLetter(str.charAt(i))) {
                if ((str.charAt(i - 1) == '+') && (str.charAt(i + 1) == '+'))
                    continue;
                else return "false";
            }
        }
        return "true";
    }
}

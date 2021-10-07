public class ReversingString {

    public static void main(String[] args) {
        ReverseString("tajniak");
    }

    static void ReverseString(String text) {
        StringBuilder stringBuilder = new StringBuilder(text);
        int length = stringBuilder.length();

        for (int i = 0; i < length / 2; i++) {
            char current = stringBuilder.charAt(i);
            int end = length - i - 1;
            // swapping first char with last
            stringBuilder.setCharAt(i, stringBuilder.charAt(end));
            // first index is swapping with last char
            stringBuilder.setCharAt(end, current);
        }
        System.out.println(stringBuilder.toString());
    }
}

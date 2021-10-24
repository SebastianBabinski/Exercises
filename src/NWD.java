public class NWD {

    public static void main(String[] args) {

        System.out.println(NWDTest(15, 3));

    }

    public static int NWDTest(int a, int b) {
        while (b != 0) {
            int c = a % b;
            a = b;
            b = c;
        }
        return a;
    }
}


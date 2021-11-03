public class NWD {

    public static void main(String[] args) {
        System.out.println(NWDTest(15, 3));
        System.out.println(NWDTest(0, 3));
        System.out.println(NWDTest(6, 3));

    }

    public static int NWDTest(int a, int b) {
        if(a <= 0 || b <= 0 ){
            System.out.println("A and B should be higher than 0.");
            return 0;
        }
        while (b != 0) {
            int c = a % b;
            a = b;
            b = c;
        }
        return a;
    }
}


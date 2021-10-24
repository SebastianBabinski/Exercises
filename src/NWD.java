public class NWD {

    public static void main(String[] args) {
        System.out.println(NWDTest(15, 3));

    }

    public static int NWDTest(int a, int b) {
        if(a <= 0 || b <= 0 ){
            System.out.println("A and B should be higher than 0.");
            System.exit(1);
        }
        while (b != 0) {
            int c = a % b;
            a = b;
            b = c;
        }
        return a;
    }
}


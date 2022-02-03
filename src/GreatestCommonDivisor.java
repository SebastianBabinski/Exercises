public class GreatestCommonDivisor {
    public static void main(String[] args) {

        System.out.println(GreatestDivisor(20, 10));

    }
    public static Integer GreatestDivisor(int a, int b) {
        if (b == 0) {
            return a;
        }
        return GreatestDivisor(b, a % b);
//        int div = 0;
//
//        if(a > b) {
//            for (int i = 1; i <= b; i++) {
//                if ((a % i) == 0 && (b % i) == 0) {
//                    div = i;
//                }
//            }
//        } else {
//            for (int i = 1; i <= a; i++) {
//                if ((a % i) == 0 && (b % i) == 0) {
//                    div = i;
//                }
//            }
//        }
//        return div;
    }
}

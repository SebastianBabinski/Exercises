//napisz program, który obliczy podana przez uzytkownika wartosc ciagu fibonacciego

import java.util.Scanner;

public class Cwiczenie3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj wyraz ciągu: ");
        Fibbonaci(scanner.nextInt());
    }

    static void Fibbonaci(int fibElements) {
        int n1 = 0;
        int n2 = 1;
        int n3 = 0;

        for (int i = 1; i < fibElements; i++){
            n3 = n1 +n2;
            n1 = n2;
            n2 = n3;
        }
        System.out.println(fibElements + " wyraz ciągu jest równy: " + n3);
    }
}

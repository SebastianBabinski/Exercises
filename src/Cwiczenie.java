// Zapewne znasz klawiaturę w starych telefonach. Np. taką w Nokii 3310 lub Sony Ericsson K750i:
//
//  Zadanie rekrutacyjne online Java
//  W tych starych modelach, żeby napisać jakąś literę należało kilka razy wcisnąć dany przycisk. I tak np. żeby uzyskać A należało wcisnąć przycisk 2 jeden raz, a żeby uzyskać Z to przycisk 9 cztery razy.
//  Dlatego np. słowo KOT oznaczało wciśnięcie klawiszy 556668.
//
//  Twoim zadaniem jest napisanie metody, która dowolne słowo zamieni właśnie na taki ciąg cyfr.


import java.util.*;

public class Cwiczenie {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj słowo, które ma zostać zamienione na ciąg cyfr: ");
        String word = scan.nextLine();
        toNumbers(word.toLowerCase(Locale.ROOT));

    }
    static void toNumbers(String word) {

        StringBuilder text = new StringBuilder();

        Map<String, String> lettersToNumbers = new HashMap<>();
        lettersToNumbers.put("a", "2");
        lettersToNumbers.put("b", "22");
        lettersToNumbers.put("c", "222");
        lettersToNumbers.put("d", "3");
        lettersToNumbers.put("e", "33");
        lettersToNumbers.put("f", "333");
        lettersToNumbers.put("g", "4");
        lettersToNumbers.put("h", "44");
        lettersToNumbers.put("i", "444");
        lettersToNumbers.put("j", "5");
        lettersToNumbers.put("k", "55");
        lettersToNumbers.put("l", "555");
        lettersToNumbers.put("m", "6");
        lettersToNumbers.put("n", "66");
        lettersToNumbers.put("o", "666");
        lettersToNumbers.put("p", "7");
        lettersToNumbers.put("q", "77");
        lettersToNumbers.put("r", "777");
        lettersToNumbers.put("s", "7777");
        lettersToNumbers.put("t", "8");
        lettersToNumbers.put("u", "88");
        lettersToNumbers.put("v", "888");
        lettersToNumbers.put("w", "9");
        lettersToNumbers.put("x", "99");
        lettersToNumbers.put("y", "999");
        lettersToNumbers.put("z", "9999");

        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            String L = Character.toString(letter);
            text.append(lettersToNumbers.get(L));
        }
        System.out.println(text);
    }
}

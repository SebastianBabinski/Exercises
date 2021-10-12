//removing duplicates ArrayList

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemovingDuplicatesFromArray {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>();

        numbers.add(2);
        numbers.add(5);
        numbers.add(3);
        numbers.add(6);
        numbers.add(5);

        System.out.println("number with duplicates: " + numbers);

        // LinkedHashSet dont allow to inster duplicates
        Set<Integer> numbersWithoutDuplicates = new LinkedHashSet<Integer>(numbers);

        // clearing and adding the numbers to ArrayList
        numbers.clear();
        numbers.addAll(numbersWithoutDuplicates);

        System.out.println("numbers without duplicates: " + numbers);
    }
}

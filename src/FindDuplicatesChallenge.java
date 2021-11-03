import java.util.*;

import static java.util.Arrays.asList;

public class FindDuplicatesChallenge {

//    public static void main(String[] args) {
//        System.out.println(findDuplicates(asList(-1, 1, 3, 2, 2, 2, 5, 6, -1, 3, 6), 2));
//    }

    public static List<Integer> findDuplicates(List<Integer> integers, int numberOfDuplicates) {
        List<Integer> duplicates = new LinkedList<>();
        int counter = 1;
        int temp = 0;

        for (int i = 0; i < integers.size(); i++) {
            for (int j = 1; j < integers.size(); j++) {
                if (integers.get(i).equals(integers.get(j))) {
                    counter++;
                }
            }
            if (counter == numberOfDuplicates) {
                temp = integers.get(i);
                duplicates.add(temp);
            }
            counter = 0;
        }
        Set<Integer> numbersWithoutDuplicates = new LinkedHashSet<Integer>(duplicates);
        duplicates.clear();
        duplicates.addAll(numbersWithoutDuplicates);
        return duplicates;
    }

}

//Introduction
//Imagine you are developing an application for the National Lottery, which is going to perform a series of complex calculations on a list of integer values in order to determine the winner.
//
//Problem Statement
//As you can see, the findDuplicates method is missing its implementation. It should return a list of values, that are repeated numberOfDuplicates times.
//
//For instance, if you invoke:
//
//findDuplicates(asList(-1, 1, 3, 2, 2, 2, 5, 6, -1, 3, 6), 2);
//it should return -1, 3 and 6 since these values are repeated numberOfDuplicates = 2 times, but not 2 which is repeated 3 times.
//
//Note: null values should be omitted:
//
// findDuplicates(asList(-1, -1, 2, 2, null, null), 2);
// should return -1 and 2.
//
// Hints
// Please pay attention to correctness but also to the quality of your solution.
// The findDuplicates method should not return a null value (if null is produces, return emptyList()).


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

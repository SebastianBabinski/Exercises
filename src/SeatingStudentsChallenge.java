//Array Challenge
//        Have the function ArrayChallenge(arr) read the array of integers stored in arr which will be in the following format: [K, r1, r2, r3, ...] where K represents the number of desks in a classroom, and the rest of the integers in the array will be in sorted order and will represent the desks that are already occupied. All of the desks will be arranged in 2 columns, where desk #1 is at the top left, desk #2 is at the top right, desk #3 is below #1, desk #4 is below #2, etc. Your program should return the number of ways 2 students can be seated next to each other. This means 1 student is on the left and 1 student on the right, or 1 student is directly above or below the other student.
//        For example: if arr is [12, 2, 6, 7, 11] then this classrooms looks like the following picture:
//
//        Based on above arrangement of occupied desks, there are a total of 6 ways to seat 2 new students next to each other. The combinations are: [1, 3], [3, 4], [3, 5], [8, 10], [9, 10], [10, 12]. So for this input your program should return 6. K will range from 2 to 24 and will always be an even number. After K, the number of occupied desks in the array can range from 0 to K.
//        Examples
//        Input: new int[] {6, 4}
//        Output: 4
//        Input: new int[] {8, 1, 8}
//        Output: 6

import java.util.HashSet;
import java.util.Set;

public class SeatingStudentsChallenge {

    public static void main(String[] args) {

        seatingStudents(new int[]{12, 2, 6, 7, 11});
        seatingStudents(new int[]{6, 4});
        seatingStudents(new int[]{8, 1, 8});
    }

    static int seatingStudents(int[] array) {
        int numberOfDesks = array[0];
        Set<Integer> occupiedDesks = new HashSet<>();
        int count = 0;

        for (int i = 1; i < array.length; i++) {
            occupiedDesks.add(array[i]);
        }

        for (int currentDesk = 1; currentDesk < numberOfDesks; currentDesk++) {
            if (isOccupied(currentDesk, occupiedDesks, numberOfDesks)) {
                continue;
            }
            if (currentDesk % 2 != 0) {
                int sideDesk = currentDesk + 1;
                if (!isOccupied(sideDesk, occupiedDesks, numberOfDesks)) {
                    count++;
                }
            }
            int belowDesk = currentDesk + 2;
            if(!isOccupied(belowDesk, occupiedDesks, numberOfDesks)) {
                count++;
            }
        }
        System.out.println(count);
        return count;
    }

    static boolean isOccupied(int desk, Set<Integer> occupiedDesks, int numberOfDesks) {
        return desk > numberOfDesks || occupiedDesks.contains(desk);
    }
}

//Have the function Consecutive(arr) take the array of integers stored in arr
// and return the minimum number of integers needed to make the contents of arr consecutive from the lowest number to the highest number.
// For example: If arr contains [4, 8, 6] then the output should be 2 because two numbers need to be added to the array (5 and 7)
// to make it a consecutive array of numbers from 4 to 8.
// Negative numbers may be entered as parameters and no array will have less than 2 elements.


import java.util.Arrays;

public class ConsecutiveChallenge {
    public static void main(String[] args) {
        Consecutive(new int[]{4, 8, 6});
        Consecutive(new int[]{5, 3});

    }

    static int Consecutive(int[] arr) {
        int maxNumber = Integer.MIN_VALUE;
        int minNumber = Integer.MAX_VALUE;
        int diff;

        if (arr.length < 2) {
            return 0;
        }

        for (int i = 0; i < arr.length; i++) {
            maxNumber = Math.max(maxNumber, arr[i]);
            minNumber = Math.min(minNumber, arr[i]);
        }
        diff = (maxNumber - minNumber) + 1;

        System.out.println(diff - arr.length);
        return diff - arr.length;

//        int counter = 0;
//        Arrays.sort(arr);
//
//        for (int i = 1; i < arr.length; i++) {
//            counter = counter + Math.abs(arr[i] - arr[i - 1] - 1);
//        }
//        return counter;

    }
}

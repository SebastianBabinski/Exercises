//Have the function LargestFour(arr) take the array of integers stored in arr, and find the four largest elements and return their sum.
// For example: if arr is [4, 5, -2, 3, 1, 2, 6, 6] then the four largest elements in this array are 6, 6, 4, and 5 and the total sum of these numbers is 21,
// so your program should return 21.
// If there are less than four numbers in the array your program should return the sum of all the numbers in the array.

import java.util.Arrays;

public class LargestFourChallenge {

    public static void main(String[] args) {
        LargestFour(new int[]{4, 5, -2, 3, 1, 2, 6, 6});
    }

    static int LargestFour(int[] arr) {
        int sum = 0;

        // checking if array is empty, returning 0 if true
        if (arr.length <= 0) {
            return 0;
        }

        // if array is less or equal 4, adding all elements
        if (arr.length <= 4) {
            for (int i : arr) {
                sum = sum + i;
            }
        }
        // sorting array to have four largest elements at the end of array
        Arrays.sort(arr);

        // adding four last elements of array
        for (int i = arr.length - 4; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println(sum);
        return sum;
    }
}

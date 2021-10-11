import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        bubbleSort(new int[]{52, 56, 14, 92, -20, 34});
    }

    static void bubbleSort(int[] arr) {
        System.out.println("Unsorted array: " + Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length - 1; j > i; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                }
            }
        }
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

    static void swap(int[] array, int from, int to) {
        int temp = array[from];
        array[from] = array[to];
        array[to] = temp;
    }
}

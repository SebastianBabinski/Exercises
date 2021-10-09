import java.util.Arrays;

public class SortingArray {

    public static void main(String[] args) {
        SortArray(new int[]{50, 70, 30, 10, 60, 20, 70});
    }

    static void SortArray(int[] array) {
        int temp = 0;
        System.out.println("Unordered array: " + Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("Ordered array: " + Arrays.toString(array));
    }
}

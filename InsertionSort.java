import java.util.*;

/*

TIME COMPLEXITY

BEST CASE       O(N)
AVERAGE CASE    O(N^2)
WORST CASE      O(N^2)

*/

public class InsertionSort {

    public static void main(String args[]) {

        int arr[] = { 12, 13, 24, 10, 3, 6, 90, 70 };

        insertionSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static int[] insertionSort(int arr[]) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {

            int current = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > current) {

                arr[j + 1] = arr[j];

                j--;
            }

            arr[j + 1] = current;
        }

        return arr;
    }

}

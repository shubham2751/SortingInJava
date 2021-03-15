import java.util.*;

/*

TIME COMPLEXITY

BEST CASE       O(N^2)
AVERAGE CASE    O(N^2)
WORST CASE      O(N^2)

*/

public class SelectionSort {

    public static void main(String args[]) {
        int arr[] = { 12, 13, 24, 10, 3, 6, 90, 70 };

        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] selectionSort(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int min = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[min] > arr[j])
                    min = j;
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

        return arr;
    }

}

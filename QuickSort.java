import java.util.*;

/*

TIME COMPLEXITY

BEST CASE       O(N LOGN)
AVERAGE CASE    O(N LOGN)
WORST CASE      O(N^2)

*/

public class QuickSort {

    public static void main(String[] args) {

        int arr[] = { 12, 13, 24, 10, 3, 6, 90, 70 };

        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

    }

    public static void quickSort(int arr[], int low, int high) {

        if (arr == null || arr.length == 0)
            return;

        if (low <= high) {
            int mid = (low + high) / 2;

            int pivot = arr[mid];

            int i = low;
            int j = high;

            while (i <= j) {
                while (arr[i] < pivot)
                    i++;

                while (arr[j] > pivot)
                    j--;

                if (i <= j) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    i++;
                    j--;
                }
            }

            if (low < j) {
                quickSort(arr, low, j);
            }

            if (i < high) {
                quickSort(arr, i, high);
            }
        }
    }

}

import java.util.*;

/*

TIME COMPLEXITY

BEST CASE       O(N LOGN)
AVERAGE CASE    O(N LOGN)
WORST CASE      O(N LOGN)

*/

public class MergeSort {

    public static void main(String args[]) {
        int arr[] = { 12, 13, 24, 10, 3, 6, 90, 70 };

        mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void mergeSort(int arr[], int low, int high) {

        if (low < high) {
            int mid = (low + high) / 2;

            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);

            Merge(arr, low, mid, high);
        }

    }

    public static void Merge(int arr[], int low, int mid, int high) {

        int n1 = mid - low + 1;
        int n2 = high - mid;

        int a[] = new int[n1];
        int b[] = new int[n2];

        for (int i = 0; i < n1; i++)
            a[i] = arr[low + i];

        for (int i = 0; i < n2; i++)
            b[i] = arr[mid + 1 + i];

        int i = 0;
        int j = 0;

        int k = low;

        while (i < n1 && j < n2) {
            if (a[i] < b[j]) {
                arr[k] = a[i];
                i++;
                k++;
            } else {
                arr[k] = b[j];
                j++;
                k++;
            }
        }

        // if "a" is not Empty
        while (i < n1) {

            arr[k] = a[i];
            i++;
            k++;

        }

        // if "b" is not Empty
        while (j < n2) {
            arr[k] = b[j];
            j++;
            k++;
        }

    }

}

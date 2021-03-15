import java.util.*;

/*
TIME COMPLEXITY

BEST CASE       O(N)
AVERAGE CASE    O(N^2)
WORST CASE      O(N^2)

*/

public class BubbleSort {
    public static void main(String args[]) {
        int arr[] = { 12, 13, 24, 10, 3, 6, 90, 70 };

        int res[] = bubbleSort(arr);
        System.out.println(Arrays.toString(res));

        int res1[] = bubbleSortOptimized(arr);
        System.out.println(Arrays.toString(res1));

    }

    public static int[] bubbleSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        return arr;
    }

    public static int[] bubbleSortOptimized(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            boolean flag = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    flag = true;
                }
            }

            if (flag == false)
                break;
        }

        return arr;
    }
}
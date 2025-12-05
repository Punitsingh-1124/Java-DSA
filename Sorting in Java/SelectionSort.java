// public class SelectionSort {
//     public static void printArrays(int arr[]) {
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {
//         int arr[] = { 7, 8, 3, 2, 1 };
//         // Selection sort
//         for (int i = 0; i < arr.length - 1; i++) {
//             int smallest = i;
//             for (int j = i + 1; j < arr.length; j++) {
//                 if (arr[smallest] > arr[j]) {
//                     smallest = j;
//                 }
//             }
//             int temp = arr[smallest];
//             arr[smallest] = arr[i];
//             arr[i] = temp;
//         }
//         printArrays(arr);
//     }
// }
// 1 2 3 7 8
// TC = O(n^2)

//or

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = { 3, 1, 5, 4, 2 };
        SelectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void SelectionSort(int[] arr) {
        // Loop through the array to find the largest element and place it at the end
        for (int i = 0; i < arr.length - 1; i++) {
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }
}
// [1, 2, 3, 4, 5]

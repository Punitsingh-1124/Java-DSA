// public class InsertionSort {
//     public static void printArrays(int arr[]) {
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {
//         int arr[] = { 7, 8, 3, 2, 1 };
//         // Insertion sort
//         for (int i = 1; i < arr.length; i++) {
//             int current = arr[i];
//             int j = i - 1;
//             while (j >= 0 && current < arr[j]) {
//                 arr[j + 1] = arr[j];
//                 j--;
//             }
//             // placement
//             arr[j + 1] = current;
//         }
//         printArrays(arr);
//     }
// }
// 1 2 3 7 8
// TC = O(n^2)

// or 

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = { 3, 1, 5, 4, 2 };
        insertion(arr);
        System.out.println(Arrays.toString(arr)); 
    }

    public static void insertion(int[] arr) {
        for (int i = 1; i < arr.length; i++) { // Start from the second element
            int current = arr[i]; // Element to be inserted
            int j = i - 1;

            // Move elements of arr[0..i-1] that are greater than current, one position
            // ahead
            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j]; // Shift the element to the right
                j--;
            }

            // Insert the current element into its correct position
            arr[j + 1] = current;
        }
    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
// [1, 2, 3, 4, 5]
// public class BubbleSort {
//     public static void printArrays(int arr[]) {
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {
//         int arr[] = { 7, 8, 3, 2, 1 };

//         // Bubble sort
//         for (int i = 0; i < arr.length - 1; i++) {
//             for (int j = 0; j < arr.length - i - 1; j++) {
//                 if (arr[j] > arr[j + 1]) {
//                     // swap
//                     int temp = arr[j];
//                     arr[j] = arr[j + 1];
//                     arr[j + 1] = temp;
//                 }
//             }
//         }
//         printArrays(arr);
//     }
// }
// 1 2 3 7 8
//// TC = O(n^2)

//or

// import java.util.Arrays;

// public class BubbleSort {
//     public static void main(String[] args) {
//         int[] arr = { 5, 6, 4, 3, 5, 6, 7, 7 };
//         Bubble(arr);
//         System.out.println(Arrays.toString(arr));

//     }

//     public static void Bubble(int[] arr) {
//         // run the step n -1 times
//         for (int i = 0; i < arr.length - 1; i++) {
//             // for each step, max item will come at the last repective index
//             for (int j = 1; j < arr.length - i; j++) {
//                 // swap if the item is smaller then the previous item
//                 if (arr[j] < arr[j - 1]) {
//                     int temp = arr[j];
//                     arr[j] = arr[j - 1];
//                     arr[j - 1] = temp;
//                 }
//             }
//         }
//     }
// }
// // [3, 4, 5, 5, 6, 6, 7, 7]

//or for sorted arrays 
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 7, 6, 5, 8, 9, 3, 4, 5, 1 };
        Bubble(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void Bubble(int[] arr) {
        boolean swapped;
        // run the step n -1 times
        for (int i = 0; i < arr.length - 1; i++) {
            swapped = false;
            // for each step, max item will come at the last repective index
            for (int j = 1; j < arr.length - i; j++) {
                // swap if the item is smaller then the previous item
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
            // if you did not swap for a particular value of i , it means the arrays is
            // sorted hence stop the program break;
            if (!swapped)
                break;
        }
    }
}
// [3, 4, 5, 5, 6, 6, 7, 7]
// nothing
// [1, 3, 4, 5, 5, 6, 7, 8, 9]
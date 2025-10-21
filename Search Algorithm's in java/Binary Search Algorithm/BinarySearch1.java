//Simple Assending order array BinarySearch Code

// public class BinarySearch1 {

//     public static void main(String[] args) {
//         int[] arr = { -18, -12, -4, 0, 2, 3, 4, 5, 15, 16, 17, 45, 89 };
//         int target = 17;
//         int ans = binarysearch(arr, target);
//         System.out.println(ans);
//     }

//     // Return the index of the target element
//     // Return -1 if it does not exist
//     public static int binarysearch(int[] arr, int target) {
//         int start = 0;
//         int end = arr.length - 1;

//         while (start <= end) {
//             // Find the middle element
//             int mid = start + (end - start) / 2; // Corrected formula

//             if (target < arr[mid]) {
//                 end = mid - 1;
//             } else if (target > arr[mid]) {
//                 start = mid + 1;
//             } else {
//                 // Target found
//                 return mid;
//             }
//         }
//         return -1; // Target not found
//     }
// }
// 10

// Order of Agnostic Binary Search

public class BinarySearch1 {

    public static void main(String[] args) {
        // int[] arr = { -18, -12, -4, 99, 100, 101, 0, 2, 3, 4, 5, 15, 16, 22, 45, 89
        // };
        int[] arr = { 22, 21, 20, 19, 18, 17, 7, 6, 5, 4, 3, 2, 1 };
        int target = 22;
        int ans = binarysearch(arr, target);
        System.out.println(ans);
    }

    // Return the index of the target element
    // Return -1 if it does not exist
    public static int binarysearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // Find whethere the array is sorted in assendinng or deascending order
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            // Find the middle element
            int mid = start + (end - start) / 2; // Corrected formula

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1; // Target not found
    }
}

// 13
// 0

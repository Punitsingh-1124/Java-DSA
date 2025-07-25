
// Q find wherether 14 exists in arrays or not
// arr = [18, 12,9 14,77,50]
// and this is unsorted arrays best case to solve this som.
// import java.util.*;

// public class Linear {
//     // Search in the array: return the index if items found
//     // otherwise if items not found return -1
//     static int linearSerach(int[] arr, int target) {
//         if (arr.length == 0) {
//             return -1;
//         }

//         // run a for loop
//         for (int index = 0; index <arr.length; index++){
//             //check for element at every index if it is = targets
//             int element = arr[index];
//             if{element == target}{
//                 return index;
//             }
//         }
//         return -1;
//     }

//     public static void main(String[] args) {
//         int[] nums = { 23, 45, 1, 2, 8, 19, -3, 16, -11, 20 };
//         int target = 19;
//         int ans = linearSerach(nums, target);
//         System.out.println(ans);
//     }

// }

import java.util.*;

public class Linear {
    // Search in the array: return the index if items found
    // otherwise if items not found return -1
    static int linearSerach(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        // run a for loop
        for (int index = 0; index < arr.length; index++) {
            // check for element at every index if it is = targets
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }

        // this line will execute if none of the return
        // hance the target not found
        return -1; // <-- This was missing: ensure a return in all code paths
    }

    public static void main(String[] args) {
        int[] nums = { 23, 45, 1, 2, 8, 19, -3, 16, -11, 20 };
        int target = 19;
        int ans = linearSerach(nums, target);
        System.out.println(ans);
    }
}
// output is 5 arrays position
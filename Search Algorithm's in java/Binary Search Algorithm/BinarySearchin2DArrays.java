// public class BinarySearchin2DArrays {

//     // Method to perform binary search in 2D array
//     public static int[] binarySearch2D(int[][] matrix, int target) {
//         if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
//             return new int[] {-1, -1}; // Return invalid position if matrix is empty
//         }

//         int rows = matrix.length;
//         int cols = matrix[0].length;

//         int row = 0;
//         int col = cols - 1;  // Start at the top-right corner

//         while (row < rows && col >= 0) {
//             int current = matrix[row][col];

//             if (current == target) {
//                 return new int[] {row, col};  // Found the target
//             } else if (current > target) {
//                 col--;  // Move left
//             } else {
//                 row++;  // Move down
//             }
//         }

//         return new int[] {-1, -1};  // Target not found
//     }

//     public static void main(String[] args) {
//         // Define the 2D sorted matrix
//         int[][] matrix = {
//             {1, 4, 7, 11},
//             {2, 5, 8, 12},
//             {3, 6, 9, 16},
//             {10, 13, 14, 17}
//         };

//         // Target value to search for
//         int target = 5;

//         // Call binarySearch2D method
//         int[] position = binarySearch2D(matrix, target);

//         // Output the result
//         if (position[0] != -1 && position[1] != -1) {
//             System.out.println("Target " + target + " found at position: (" + position[0] + ", " + position[1] + ")");
//         } else {
//             System.out.println("Target " + target + " not found.");
//         }
//     }
// }

//Or this one 

import java.lang.reflect.Array;
import java.util.Arrays;

public class BinarySearchin2DArrays {

    public static void main(String[] args) {
        int[][] matrix = {
                { 10, 20, 30, 40 },
                { 11, 25, 35, 45 },
                { 28, 29, 37, 49 },
                { 33, 34, 38, 50 }
        };
        System.out.println(Arrays.toString(search(matrix, 50)));
    }

    public static int[] search(int[][] matrix, int target) {
        int r = 0;
        int c = matrix.length - 1;
        while (r < matrix.length && c >= 0) {
            if (matrix[r][c] == target) {
                return new int[] { r, c };
            }
            if (matrix[r][c] < target) {
                r++;
            } else {
                c--;
            }
        }
        return new int[] { -1, -1 };
    }
}
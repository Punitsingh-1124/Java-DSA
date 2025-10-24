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

// import java.lang.reflect.Array;
// import java.util.Arrays;

// public class BinarySearchin2DArrays {

//     public static void main(String[] args) {
//         int[][] matrix = {
//                 { 10, 20, 30, 40 },
//                 { 11, 25, 35, 45 },
//                 { 28, 29, 37, 49 },
//                 { 33, 34, 38, 50 }
//         };
//         System.out.println(Arrays.toString(search(matrix, 50)));
//     }

//     public static int[] search(int[][] matrix, int target) {
//         int r = 0;
//         int c = matrix.length - 1;
//         while (r < matrix.length && c >= 0) {
//             if (matrix[r][c] == target) {
//                 return new int[] { r, c };
//             }
//             if (matrix[r][c] < target) {
//                 r++;
//             } else {
//                 c--;
//             }
//         }
//         return new int[] { -1, -1 };
//     }
// }

//or Search in  Shorted arrays
import java.util.Arrays;

public class BinarySearchin2DArrays {

    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };
        System.out.println(Arrays.toString(search(matrix, 9)));
    }

    // search in the row provided between the cols provided
    public static int[] binarySearchInSortedArrays(int[][] matrix, int row, int cStart, int cEnd, int target) {
        while (cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;
            if (matrix[row][mid] == target) {
                return new int[] { row, mid };
            }
            if (matrix[row][mid] < target) {
                cStart = mid + 1;
            } else {
                cEnd = mid - 1;
            }
        }
        return new int[] { -1, -1 };
    }

    public static int[] search(int[][] matrix, int target) {
        int r = matrix.length;
        int cols = matrix[0].length;

        // Special case if there's only one row
        if (r == 1) {
            return binarySearchInSortedArrays(matrix, 0, 0, cols - 1, target);
        }

        int rStart = 0;
        int rEnd = r - 1;
        int cMid = cols / 2;

        // run the loop until 2 rows are remaining
        while (rStart < (rEnd - 1)) {
            int mid = rStart + (rEnd - rStart) / 2;
            if (matrix[mid][cMid] == target) {
                return new int[] { mid, cMid };
            }
            if (matrix[mid][cMid] < target) {
                rStart = mid;
            } else {
                rEnd = mid;
            }
        }

        // now we have two rows to check
        // check whether the target is in the col of 2 rows
        if (matrix[rStart][cMid] == target) {
            return new int[] { rStart, cMid };
        }
        if (matrix[rStart + 1][cMid] == target) {
            return new int[] { rStart + 1, cMid };
        }

        // search in the last half
        if (target <= matrix[rStart][cMid - 1]) {
            return binarySearchInSortedArrays(matrix, rStart, 0, cMid - 1, target);
        }
        // search in the 2nd half
        if (target >= matrix[rStart][cMid + 1] && target <= matrix[rStart][cols - 1]) {
            return binarySearchInSortedArrays(matrix, rStart, cMid + 1, cols - 1, target);
        }
        // search in the 3rd half
        if (target <= matrix[rStart + 1][cMid - 1]) {
            return binarySearchInSortedArrays(matrix, rStart + 1, 0, cMid - 1, target);
        }
        // search in the 4th half
        else {
            return binarySearchInSortedArrays(matrix, rStart + 1, cMid + 1, cols - 1, target);
        }
    }
}

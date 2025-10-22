public class BinarySearchin2DArrays {

    // Method to perform binary search in 2D array
    public static int[] binarySearch2D(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return new int[] {-1, -1}; // Return invalid position if matrix is empty
        }

        int rows = matrix.length;
        int cols = matrix[0].length;

        int row = 0;
        int col = cols - 1;  // Start at the top-right corner

        while (row < rows && col >= 0) {
            int current = matrix[row][col];

            if (current == target) {
                return new int[] {row, col};  // Found the target
            } else if (current > target) {
                col--;  // Move left
            } else {
                row++;  // Move down
            }
        }

        return new int[] {-1, -1};  // Target not found
    }

    public static void main(String[] args) {
        // Define the 2D sorted matrix
        int[][] matrix = {
            {1, 4, 7, 11},
            {2, 5, 8, 12},
            {3, 6, 9, 16},
            {10, 13, 14, 17}
        };
        
        // Target value to search for
        int target = 5;

        // Call binarySearch2D method
        int[] position = binarySearch2D(matrix, target);

        // Output the result
        if (position[0] != -1 && position[1] != -1) {
            System.out.println("Target " + target + " found at position: (" + position[0] + ", " + position[1] + ")");
        } else {
            System.out.println("Target " + target + " not found.");
        }
    }
}

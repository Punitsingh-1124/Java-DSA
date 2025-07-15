// 2D Arrays

// rows = 3
// colums = 3 in this matrixs data

// Declaretion
// type[][] arrayName = new type[rows][columns];
// int[][]numbers = new int [3][5];

// import java.util.*;

// public class TwoDarray {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int rows = sc.nextInt();
//         int cols = sc.nextInt();

//         int[][] numbers = new int[rows][cols];

//         // input
//         // rows
//         for (int i = 0; i < rows; i++) {
//             // columns
//             for (int j = 0; j < cols; j++) {
//                 numbers[i][j] = sc.nextInt();
//             }
//         }

//         // Output
//         for (int i = 0; i < rows; i++) {
//             for (int j = 0; j < cols; j++) {
//                 System.out.print(numbers[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }

// Q Take a matrix as input from the user. Serach For a given number x and print
// the indices at which it occurs.

import java.util.*;

public class TwoDarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] numbers = new int[rows][cols];

        // input
        // rows
        for (int i = 0; i < rows; i++) {
            // columns
            for (int j = 0; j < cols; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }

        int x = sc.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // compare with x
                if (numbers[i][j] == x) {
                    System.out.println("x forund at location (" + i + ", " + j + ")");
                }
            }
        }
    }
}

// Q1 : Print the pattern (Solid Rectangle):
// *****
// *****
// *****
// *****

// using
// Nested loops
// for(..){
// for(..){

// }
// }

// import java.util.*;

// public class Patterns {

//     public static void main(String[] args) {
//         int n = 4;
//         int m = 5;
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= m; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// Q2 : print the pattern (Hellow Rectangle) :
// *****
// * *
// * *
// *****
// import java.util.*;

// public class Patterns {

//     public static void main(String[] args) {
//         int n = 4;
//         int m = 5;
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= m; j++) {
//                 if (i == 1 || j == 1 || i == n || j == m) {
//                     System.out.print("*");
//                 } else {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }

// Q3 : Print pattern (half pyramind):
// *
// **
// ***
// ****

// public class Patterns {

//     public static void main(String[] args) {
//         int n = 4;
//         int m = 5;
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// Q4 : print pattern (Inverted half pyramind):
// ****
// ***
// **
// *

// import java.util.*;

// public class Patterns {

//     public static void main(String[] args) {
//         int n = 4;
//         for (int i = n; i >= 1; i--) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

//Q5 : print the print inverted half pyramid -(rotated by 180 deg):
//    *
//   **
//  ***
// ****

// import java.util.*;

// public class Patterns {

//     public static void main(String[] args) {
//         int n = 4;

//         for (int i = 1; i <= n; i++) {
//             // inner loop -> space print
//             for (int j = 1; j <= n - i; j++) {
//                 System.out.print(" ");
//             }
//             // inner loop -> star print
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// Q6 : print the pattern (half pyramid with number):
// 1 
// 1 2
// 1 2 3
// 1 2 3 4
// 1 2 3 4 5

// import java.util.*;

// public class Patterns {

//     public static void main(String[] args) {
//         int n = 5;

//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(j + " ");
//             }
//             System.out.println();
//         }
//     }
// }

// Q7 : print pattern (inverted half pyramind with numbers):
// 1 2 3 4 5 
// 1 2 3 4
// 1 2 3
// 1 2
// 1

// import java.util.*;

// public class Patterns {

//     public static void main(String[] args) {
//         int n = 5;
//         for (int i = n; i >= 1; i--) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(j + " ");
//             }
//             System.out.println();
//         }
//     }
// }

// or

// import java.util.*;

// public class Patterns {

//     public static void main(String[] args) {
//         int n = 5;
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <=n-i+1; j++) {
//                 System.out.print(j + " ");
//             }
//             System.out.println();
//         }
//     }
// }

//Q8 : print pattern (Floyd's triangle):
// 1 
// 2 3
// 4 5 6
// 7 8 9 10
// 11 12 13 14 15

// import java.util.*;

// public class Patterns {

//     public static void main(String[] args) {
//         int n = 5;
//         int number = 1;
//         for (int i = 1; i <= n; i++) {
//             // inner loop
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(number + " ");
//                 number++;
//             }
//             System.out.println();
//         }
//     }
// }

//Q9 : print pattern (0-1 Triangle):
// 1 
// 0 1
// 1 0 1
// 0 1 0 1
// 1 0 1 0 1

import java.util.*;

public class Patterns {

    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            // inner loop
            for (int j = 1; j <= i; j++) {
                int sum = i + j;
                if (sum % 2 == 0) { // even
                    System.out.print("1 ");
                } else { // odd
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}

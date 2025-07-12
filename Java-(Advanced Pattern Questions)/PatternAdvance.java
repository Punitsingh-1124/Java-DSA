// Q1 Print the pattern :
// *        *
// **      **
// ***    ***
// ****  ****
// **********
// **********
// ****  ****
// ***    ***
// **      **
// *        *

// import java.util.*;

// public class PatternAdvance {
//     public static void main(String[] args) {
//         int n = 5;

//         // upper half
//         for (int i = 1; i <= n; i++) {
//             // 1st part
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }
//             // space
//             int spaces = 2 * (n - i);
//             for (int j = 1; j <= spaces; j++) {
//                 System.out.print(" ");
//             }
//             // 2n part
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

//         // Lower Half
//         for (int i = n; i >= 1; i--) {
//             // 1st part
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }
//             // space
//             int spaces = 2 * (n - i);
//             for (int j = 1; j <= spaces; j++) {
//                 System.out.print(" ");
//             }
//             // 2n part
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

//     }
// }

// Q2 print the pattern(solid rhombus) :
//     *****
//    *****
//   *****
//  *****
// *****

// import java.util.*;

// public class PatternAdvance {
//     public static void main(String[] args) {
//         int n = 5;
//         for (int i = 1; i <= n; i++) {
//             // space
//             for (int j = 1; j <= n - i; j++) {
//                 System.out.print(" ");
//             }

//             // stars
//             for (int j = 1; j <= 5; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

//Q3 print the pattern (number pyramid):
//     1 
//    2 2
//   3 3 3
//  4 4 4 4
// 5 5 5 5 5

// import java.util.*;

// public class PatternAdvance {
//     public static void main(String[] args) {
//         int n = 5;
//         for (int i = 1; i <= n; i++) {
//             // space
//             for (int j = 1; j <= n - i; j++) {
//                 System.out.print(" ");
//             }

//             // numbers -> print row numbers , row no. times
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(i + " ");
//             }
//             System.out.println();
//         }
//     }
// }

// Q4 Print the Pattern (palindromic pattern):
//    1
//    212
//   32123
//  4321234
// 543212345

// import java.util.*;

// public class PatternAdvance {
//     public static void main(String[] args) {
//         int n = 5;
//         for (int i = 1; i <= n; i++) {
//             // space
//             for (int j = 1; j <= n - i; j++) {
//                 System.out.print(" ");
//             }

//             // 1st half numbers
//             for (int j = i; j >= 1; j--) {
//                 System.out.print(j);
//             }
//             // 2nd half numbers
//             for (int j = 2; j <= i; j++) {
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }

// Q5 Print patterns (Diamond pattern):
//     *
//    ***
//   *****
//  *******
// *********
// *********
//  *******
//   *****
//    ***
//     *

import java.util.*;

public class PatternAdvance {
    public static void main(String[] args) {
        int n = 5;
        // upper half
        for (int i = 1; i <= n; i++) {
            // space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // 1st half numbers
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // lower half
        for (int i = n; i >= 1; i--) {
            // space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // 1st half numbers
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

// Loops

// for loop
// while loop
// do while loop

// for(initialisation; condition; updation){
//     //do something
// }

//Q1 for stregth line
// public class Loop {
//     public static void main(String[] args) {
//         for (int counter = 0; counter <= 10; counter++)
//             System.out.println(counter);
//     }
// }

// Q2 for horizontal line
// public class Loop {
//     public static void main(String[] args) {
//         for (int counter = 0; counter <= 10; counter++)
//             System.out.print(counter + " ");
//     }
// }

// and easy way
// public class Loop {
//     public static void main(String[] args) {
//         for (int i = 0; i <= 10; i++)
//             System.out.println(i);
//     }
// }

// whiile (condition){
//     //do something
// }

//Q3
// public class Loop {
//     public static void main(String[] args) {
//         int i = 0;
//         while (i < 11) {
//             System.out.println(i);
//             i++; // i = i + 1;
//         }
//     }
// }

// do {
//     //do something
// }while(condition)

//Q4
// public class Loop {
//     public static void main(String[] args) {
//         int i = 0;
//         do {
//             System.out.println(i);
//             i++; // i = i + 1;
//         } while (i < 11);
//     }
// }

//Q5 : Diffrenece between while loop vs do while loop
// public class Loop {
//     public static void main(String[] args) {
//         int i = 12;
//         while (i < 11) {
//             System.out.println("Hello"); // in this condition its check i=12 then condition already match i< 11 nothing
//                                          // to pring
//         }
//         //
//         do {
//             System.out.println("Hello"); // its print 1 time Hello then its see i=12 and condition is i< 11 then nothing
//                                          // to print after one time
//         } while (i < 11);
//     }
// }

// Q6 : Print the sum of  first n natural Numbers 
// import java.util.*;;

// public class Loop {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         int sum = 0;
//         for (int i = 0; i <= n; i++) {
//             sum = sum + i;
//         }
//         System.out.println(sum);
//     }
// }

//Q7 : Print the table of a number input by user .
import java.util.*;;

public class Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;
        for (int i = 1; i < 11; i++) {
            System.out.println(i * n);
        }
    }
}
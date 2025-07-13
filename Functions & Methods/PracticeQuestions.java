//Q1 Enter 3 numbers from the user & make a function to print their average.

// import java.util.*;

// public class PracticeQuestions {
//     public static int calculateAvg(int a, int b, int c) {
//         int avg = (a + b + c) / 3;
//         return avg;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int c = sc.nextInt();

//         System.out.println("Average of three Numbers :" + calculateAvg(a, b, c));
//     }
// }

// Q2 Write a function to print the sum of all odd numbers from 1 to n.

// import java.util.*;

// public class PracticeQuestions {

//     // Function to return the sum of all odd numbers from 1 to n
//     public static int oddNumbers(int n) {
//         int sum = 0;
//         for (int i = 1; i <= n; i++) {
//             if (i % 2 != 0) {
//                 sum = sum + i;
//             }
//         }
//         System.out.println(sum);
//         return sum;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int n = sc.nextInt();

//         int result = oddNumbers(n);
//         System.out.println("Sum of odd numbers from 1 to " + n + " is: " + result);
//     }
// }

//Q3 Write a function which takes in 2 numbers and returns the greater of those two.

import java.util.*;

public class PracticeQuestions {

    // Function to return the greater number between a and b
    public static int greaterNum(int a, int b) {
        if (a == b) {
            System.out.println("both are equal");
            return a; // or return -1 if you want to handle it differently
        } else if (a > b) {
            System.out.println(a + " is greater");
            return a;
        } else
            System.out.println(b + " is greater");
        return b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int result = greaterNum(a, b);
        System.out.println("Greater Number is :" + result);
    }
}

// Q4 Write a function that takes in the radius as input and returns the
// circumference of a circle.

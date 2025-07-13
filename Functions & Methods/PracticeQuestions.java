// Q1 Enter 3 numbers from the user & make a function to print their average.

// import java.util.*;

// public class PracticeQuestions {
// public static int calculateAvg(int a, int b, int c) {
// int avg = (a + b + c) / 3;
// return avg;
// }

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int a = sc.nextInt();
// int b = sc.nextInt();
// int c = sc.nextInt();

// System.out.println("Average of three Numbers :" + calculateAvg(a, b, c));
// }
// }

// Q2 Write a function to print the sum of all odd numbers from 1 to n.

// import java.util.*;

// public class PracticeQuestions {

// // Function to return the sum of all odd numbers from 1 to n
// public static int oddNumbers(int n) {
// int sum = 0;
// for (int i = 1; i <= n; i++) {
// if (i % 2 != 0) {
// sum = sum + i;
// }
// }
// System.out.println(sum);
// return sum;
// }

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.print("Enter a number: ");
// int n = sc.nextInt();

// int result = oddNumbers(n);
// System.out.println("Sum of odd numbers from 1 to " + n + " is: " + result);
// }
// }

// Q3 Write a function which takes in 2 numbers and returns the greater of those
// two.

// import java.util.*;

// public class PracticeQuestions {

// // Function to return the greater number between a and b
// public static int greaterNum(int a, int b) {
// if (a == b) {
// System.out.println("both are equal");
// return a; // or return -1 if you want to handle it differently
// } else if (a > b) {
// System.out.println(a + " is greater");
// return a;
// } else
// System.out.println(b + " is greater");
// return b;
// }

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.print("Enter a number: ");
// int a = sc.nextInt();
// int b = sc.nextInt();

// int result = greaterNum(a, b);
// System.out.println("Greater Number is :" + result);
// }
// }

// Q4 Write a function that takes in the radius as input and returns the
// circumference of a circle.

// import java.util.Scanner;

// public class PracticeQuestions {

// // Function to return the circumference of a circle
// public static double Circumference(double r) {
// double pi = 3.14159;
// double circumference = (2 * pi * r);
// return circumference;
// }

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.print("Enter a number: ");
// int r = sc.nextInt();

// double result = Circumference(r);

// System.out.println("The circumference of the circle: " + result);
// }
// }

// Q5 Write an infinite loop using do while condition.

// dont use is infinite loop dont use this

// import java.util.Scanner;

// public class PracticeQuestions {
// public static void main(String[] args) {
// do {
// System.out.println("Hello world");
// } while (true);
// }
// }

// Q6 Write a program to enter the numbers till the user wants and at the end it
// should display the count of positive, negative and zeros entered.

// import java.util.*;;

// public class PracticeQuestions {

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);

// int positiveCount = 0;
// int negativeCount = 0;
// int zeroCount = 0;

// char choice;

// do {
// System.out.print("Enter a number: ");
// int num = sc.nextInt();

// if (num > 0) {
// positiveCount++;
// } else if (num < 0) {
// negativeCount++;
// } else {
// zeroCount++;
// }

// System.out.print("Do you want to enter another number? (y/n): ");
// choice = sc.next().charAt(0);

// } while (choice == 'y' || choice == 'Y');

// System.out.println("Count of positive numbers: " + positiveCount);
// System.out.println("Count of negative numbers: " + negativeCount);
// System.out.println("Count of zeros: " + zeroCount);
// }
// }

// Q7 Two numbers are entered by the user, x and n. Write a function to find the
// value of one number raised to the power of another i.e. xn.

// import java.util.Scanner;

// public class PracticeQuestions {

//     // Function to calculate x raised to the power n
//     public static int power(int x, int n) {
//         int result = 1;
//         for (int i = 1; i <= n; i++) {
//             result *= x;
//         }
//         return result;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter base (x): ");
//         int x = sc.nextInt();

//         System.out.print("Enter exponent (n): ");
//         int n = sc.nextInt();

//         int result = power(x, n);
//         System.out.println(x + " raised to the power " + n + " is: " + result);
//     }
// }

// Q8 Write a function that takes in age as input and returns if that person is
// eligible to vote or not. A person of age > 18 is eligible to vote.

// import java.util.Scanner;

// public class PracticeQuestions {

//     // Function to calculate x raised to the power n
//     public static boolean voteFun(int age) {
//         return age > 18;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter age: ");
//         int age = sc.nextInt();

//         if (voteFun(age)) {
//             System.out.println("The person is eligible to vote.");
//         } else {
//             System.out.println("The person is NOT eligible to vote.");
//         }
//     }
// }

// Q9 Write a function that calculates the Greatest Common Divisor of 2 numbers.

// import java.util.*;

// public class PracticeQuestions {

//     // Function to calculate GCD of two numbers
//     public static int findGCD(int a, int b) {
//         while (b != 0) {
//             int temp = b;
//             b = a % b;
//             a = temp;
//         }
//         return a;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter first number: ");
//         int num1 = sc.nextInt();

//         System.out.print("Enter second number: ");
//         int num2 = sc.nextInt();

//         int gcd = findGCD(num1, num2);
//         System.out.println("The GCD of " + num1 + " and " + num2 + " is: " + gcd);
//     }
// }

// Q10 Write a program to print Fibonacci series of n terms where n is input by
// user :
// 0 1 1 2 3 5 8 13 21 .....
// In the Fibonacci series, a number is the sum of the previous 2 numbers that
// came before it.

import java.util.*;

public class PracticeQuestions {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of terms (n): ");
        int n = sc.nextInt();

        int first = 0, second = 1;

        System.out.print("Fibonacci Series up to " + n + " terms: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }
    }
}

//Functio is a block of code to input -> operation -> output perfform

//returnType functionName(type arg1, type arg2..){
// operation
// }

// Q1 Print a given name in a function 

// import java.util.*;

// public class Functions {
//     public static void printMyName(String name) {
//         System.out.println(name);
//         return;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String name = sc.next();

//         printMyName(name); // calling function

//     }
// }

//Q2 Make a function to add 2 numbers and return the sum.

// import java.util.*;

// public class Functions {
//     public static int calculateSum(int a, int b) {
//         int sum = a + b;
//         return sum;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();

//         int sum = calculateSum(a, b); // calling function
//         System.out.println("Sum of two number is : " + sum);
//     }
// }

//Q3 Make function to multiply 2 numbers and return the product

// import java.util.*;

// public class Functions {
//     public static int multiplySum(int a, int b) {
//         return a * b;

//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();

//         // calling function
//         System.out.println("multiply of two number is : " + multiplySum(a, b));
//     }
// }

//Q4 Find the factorial of a number.

import java.util.*;

public class Functions {
    public static void printfactorial(int n) {
        if (n < 0) {
            System.out.println("Invalid Number");
            return;
        }
        // loop
        int factorial = 1;
        for (int i = n; i >= 1; i--) {
            factorial = factorial * i;
        }
        System.out.println(factorial);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printfactorial(n);
    }
}

// Methods
// The method also the some like function take input -> operation -> output.
// small differece is methods call by class ke object ke sath
// small differece is function call by directly
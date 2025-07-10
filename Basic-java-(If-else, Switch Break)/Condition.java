// Conditional Stateme
// or Key words
// if else
// else if
// switch
// break

// Q1
// import java.util.*;

// public class Condition {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int age = sc.nextInt();
// if (age > 18) {
// System.out.println("adult");
// } else {
// System.out.println("Not adult");
// }
// }
// }

// Q2
// import java.util.*;

// public class Condition {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int x = sc.nextInt();
// if (x % 2 == 0) {
// System.out.println("Even");
// } else {
// System.out.println("Odd");
// }
// }
// }

// Q3
// import java.util.*;

// public class Condition {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int a = sc.nextInt();
// int b = sc.nextInt();

// if (a == b) {
// System.out.println("Equal");
// } else {
// if (a > b) {
// System.out.println("a is greater");
// } else {
// System.out.println("a is lesser");
// }
// }
// }
// }

// Q3.2
// import java.util.*;

// public class Condition {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();

//         if (a == b) {
//             System.out.println("Equal");
//         } else if (a > b) {
//             System.out.println("a is greater");
//         } else {
//             System.out.println("a is lesser");
//         }
//     }
// }

// Q4. print the Greeting 
// import java.util.*;

// public class Condition {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int button = sc.nextInt();

//         if (button == 1) {
//             System.out.println("Hello");
//         } else if (button == 2) {
//             System.out.println("Namaste");
//         } else if (button == 3) {
//             System.out.println("Bonjour");
//         } else {
//             System.out.println("Invalid Button");
//         }
//     }
// }

//Q5.
// import java.util.*;

// public class Condition {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int button = sc.nextInt();

//         switch (button) {
//             case 1:
//                 System.out.println("hello");
//                 break;
//             case 2:
//                 System.out.println("Namaste");
//                 break;
//             case 3:
//                 System.out.println("Bonjour");
//                 break;
//             default:
//                 System.out.println("Invalid Button");
//         }

//     }
// }

// Q6.  Making Calculator
import java.util.*;

public class Condition {
    public static void main(String[] args) {

        char operator;
        Double number1, number2, result;

        Scanner input = new Scanner(System.in);
        System.out.println("Choose an operator: +, -, *, or /");
        operator = input.next().charAt(0);

        System.out.println("Enter first number");
        number1 = input.nextDouble();
        System.out.println("Enter first number");
        number2 = input.nextDouble();

        switch (operator) {
            case '+':
                result = number1 + number2;
                System.out.println(number1 + " + " + number2 + " = " + result);
                break;
            case '-':
                result = number1 - number2;
                System.out.println(number1 + " + " + number2 + " = " + result);
                break;
            case '*':
                result = number1 * number2;
                System.out.println(number1 + " + " + number2 + " = " + result);
                break;
            case '/':
                result = number1 / number2;
                System.out.println(number1 + " + " + number2 + " = " + result);
                break;
            default:
                System.out.println("Invalid operator!");
                break;
        }
    }
}

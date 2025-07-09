// a = 25 , b=10

// 2*(a+b) ---> Constant*(variable + variable)

// public class Variable {

// public static void main(String[] args) {
// // variables and this all examples are Data Types
// String name = "tony stark";
// int age = 48;
// double price = 25.25;
// int a = 25;
// int b = 10;
// }
// }

// Data Types

// primitive
// byte,short,char,boolean,int,long,float,double

// Non-primitive
// string,Array,class,Object,Interface

// example:

// public class Variable {

// public static void main(String[] args) {
// int a = 10;
// int b = 25;
// int sum = a + b;
// // System.out.println(sum);
// // 35
// int diff = b - a;
// // System.out.println(diff);
// // 15

// }
// }

// peoritiy of operants
// * , / , % , > , - +

// import java.util.*;

// public class Variable {
//     public static void main(String[] args) {
//         // input
//         // Scanner sc = new Scanner(System.in);
//         // String name = sc.next();
//         // System.out.println(name);

//         // My input and outpust
//         // tony stark --input
//         // tony --output

//         Scanner sc = new Scanner(System.in);
//         String name = sc.nextLine();
//         System.out.println(name);

//         // My input and outpust
//         // tony stark
//         // tony stark
//     }
// }

// There is many types of next().
// next()
// nextLine()
// nextInt()
// nextFloat()
// etc

// Qs.take 2 variable 'a' & 'b' and print their sum. 

import java.util.*;

public class Variable {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println(sum);
    }
}
// o/p
// 10
// 5
// 15
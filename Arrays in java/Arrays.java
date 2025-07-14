// Arrays
// List of items of the some type

// Defining an Arrays(1)
// type[]arrayName = new type[size]

// import java.util.*;;

// public class Arrays {
//     public static void main(String[] args) {
//         // int[] marks = new int[3]; // i can write like this also
//         int marks[] = new int[3];
//         marks[0] = 97;
//         marks[1] = 98;
//         marks[2] = 95;
//         // System.out.println(marks[0]);
//         // System.out.println(marks[1]);
//         // System.out.println(marks[2]);

//         // or

//         for (int i = 0; i < 3; i++) {
//             System.out.println(marks[i]);
//         }
//     }
// }

// Defining an array(2)
// type[]arrayName = {1,2,3,4,5,6}

// import java.util.*;;

// public class Arrays {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();

//         int numbers[] = new int[size];

//         // input
//         for (int i = 0; i < size; i++) {
//             numbers[i] = sc.nextInt();
//         }

//         // output
//         for (int i = 0; i < size; i++) {
//             System.out.println("Your Arr" + numbers[i]);
//         }
//     }
// }

// 5
// 5
// 4
// 3
// 2
// 1
// Your Arr5
// Your Arr4
// Your Arr3
// Your Arr2
// Your Arr1

// Q1 take an array as input from the user. search for a given number x and
// print the index at which its occurs.

//Linear Search

import java.util.*;;

public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int numbers[] = new int[size];

        // input
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        int x = sc.nextInt();

        // output
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == x) {
                System.out.println("X found at index 4" + i);
            }
        }
    }
}
// 5
// 1
// 2
// 3
// 4
// 5
// 2 //search this found in arr
// X found at index 1
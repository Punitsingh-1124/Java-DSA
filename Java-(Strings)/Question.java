//Q1. Find Duplicate Characters in a String 
// import java.util.*;

// public class Question {
//     public static void main(String[] args) {
//         String A = "PRAKASH";

//         Set<Character> seen = new HashSet<>();  // Use generics to specify the type of elements in the set

//         // First check using HashSet to find duplicate characters
//         for (int i = 0; i < A.length(); i++) {
//             if (!seen.add(A.charAt(i))) {  // If the character is already present, it won't be added
//                 System.out.println("Rejected at " + A.charAt(i));
//             }
//         }

//         // Convert the string to a char array and sort it
//         char[] AcharArray = A.toCharArray();
//         Arrays.sort(AcharArray);

//         // Check for duplicates in the sorted char array
//         for (int i = 1; i < AcharArray.length; i++) {
//             if (AcharArray[i] == AcharArray[i - 1]) {
//                 System.out.println("Rejected at " + AcharArray[i]);
//             }
//         }
//     }
// }

//Rejected at A
// Rejected at A

//Q2. print all the duplicate characters in a string 
// Java Code to print duplicate characters 
// and their counts using Sorting 
// import java.util.*;

// class Question {

//     // Function to print duplicate characters with their count
//     static void printDuplicates(String s) {

//         // Convert string to character array
//         char[] arr = s.toCharArray();

//         // Sort the string to group same characters together
//         Arrays.sort(arr);

//         // Traverse the sorted string to count duplicates
//         for (int i = 0; i < arr.length;) {

//             int count = 1;

//             // Count occurrences of current character
//             while (i + count < arr.length && arr[i] == arr[i + count]) {
//                 count++;
//             }

//             // If count > 1, print the character and its count
//             if (count > 1) {
//                 System.out.print("['" + arr[i] + "', " + count + "], ");
//             }

//             // Move to the next different character
//             i += count;
//         }
//     }

//     public static void main(String[] args) {

//         String s = "geeksforgeeks";

//         printDuplicates(s);
//     }
// }
// // ['e', 4], ['g', 2], ['k', 2], ['s', 2],

//Q3. Rotate String
// public class Question {

//     // Method to check if one string is a rotation of another
//     public static boolean rotateString(String s, String goal) {
//         return s.length() == goal.length() && (s + s).contains(goal);
//     }

//     // Main method to test the function
//     public static void main(String[] args) {
//         String s = "abcde";
//         String goal = "cdeab";

//         boolean result = rotateString(s, goal);
//         System.out.println("Is \"" + goal + "\" a rotation of \"" + s + "\"? " + result);
//     }
// }

//Solution 2
// public class Question {

//     // Method to check if one string is a rotation of another
//     public static boolean rotateString(String s, String goal) {
//         if (goal.length() != s.length()) {
//             return false;
//         }
//         String rotated = s + s;
//         return rotated.contains(goal);
//     }

//     // Main method to test the function
//     public static void main(String[] args) {
//         String s = "abcde";
//         String goal = "cdeab";

//         boolean result = rotateString(s, goal);
//         System.out.println("Is \"" + goal + "\" a rotation of \"" + s + "\"? " + result);
//     }
// }

// Is "cdeab" a rotation of "abcde"? true

//Q4. 38. Count and Say (38)
public class Question {
    public static void main(String[] args) {
        int n = 5; // You can change this value to test other inputs
        String result = countAndSay(n);
        System.out.println("Count and Say result for n = " + n + ": " + result);
    }

    public static String countAndSay(int n) {
        String s = "1";
        for (int i = 1; i < n; i++) { // Fix: start from i = 1 instead of i = 0
            s = countAndSayHelper(s);
        }
        return s;
    }

    public static String countAndSayHelper(String s) {
        StringBuilder sb = new StringBuilder();
        char previous = s.charAt(0);
        int count = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == previous) {
                count++;
            } else {
                sb.append(count);
                sb.append(previous);
                previous = s.charAt(i);
                count = 1;
            }
        }
        sb.append(count);
        sb.append(previous);
        return sb.toString();
    }
}
// Count and Say result for n = 5: 111221

// Strings in Java are immutable

// import java.util.*;

// public class MyStringBuilder {
//     public static void main(String[] args) {
//         StringBuilder sb = new StringBuilder("Harry");
//         System.out.println(sb);
//         // Harry

//         // charAt index 0
//         System.out.println(sb.charAt(0));
//         // H

//         // set char at index 0
//         sb.setCharAt(0, 'p');
//         System.out.println(sb);
//         // parry

//         // Inset
//         sb.insert(2, 'r');
//         System.out.println(sb);
//         // Sparry
//         // parrry

//         sb.delete(2, 5);
//         System.out.println(sb);
//         // parry
//         // pay

//     }
// }

//Append
// import java.util.*;

// public class MyStringBuilder {
//     public static void main(String[] args) {
//         StringBuilder sb = new StringBuilder("h");
//         sb.append("e");
//         sb.append("l");
//         sb.append("l");
//         sb.append("o");
//         System.out.println(sb.length());
//         // hello
//         // 5
//     }
// }

//Reverce the string
import java.util.*;

public class MyStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        for (int i = 0; i < sb.length() / 2; i++) {
            int front = i;
            int back = sb.length() - 1 - i; // 5-1-0 = > 4

            char frontChar = sb.charAt(front);
            char bachChar = sb.charAt(back);

            sb.setCharAt(front, bachChar);
            sb.setCharAt(back, frontChar);

            System.out.println(sb);

        }
    }
}
// olleh
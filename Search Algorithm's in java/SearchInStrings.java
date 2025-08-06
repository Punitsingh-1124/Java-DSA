// import java.util.*;

// public class SearchInStrings {

//     public static boolean searchString(String str, char target) {
//         if (str.length() == 0) {
//             return false;
//         }

//         for (int i = 0; i < str.length(); i++) {
//             if (target == str.charAt(i)) {
//                 return true;
//             }
//         }
//         return false;
//     }

//     public static void main(String[] args) {
//         String name = "kunal";
//         char target = 'u';
//         System.out.println(searchString(name, target));
//     }
// }
// true

import java.util.*;

public class SearchInStrings {

    public static boolean searchString2(String str, char target) {
        if (str.length() == 0) {
            return false;
        }

        for (char ch : str.toCharArray()) {
            if (ch == target) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String name = "kunal";
        char target = 'u';
        System.out.println(Arrays.toString(name.toCharArray()));
    }
}
// [k, u, n, a, l]
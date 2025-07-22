//Strings are immutable

//Normal String Declaration

// public class Strings {
//     public static void main(String[] args) {
//         // String Declaration
//         String name = "Harry";
//         String fullName = "Tom Hardly";
//         String sentence = "My name is Tom hardly";
//     }
// }

//Taking Input From User name is string

// import java.util.*;

// public class Strings {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String name = sc.nextLine();
//         System.out.println("Your name is :" + name);
//     }
// }

//Concatenation
// import java.util.*;

// public class Strings {
//     public static void main(String[] args) {
//         String firstName = "tony";
//         String lastName = "stark";
//         String fullName = firstName + " " + lastName;
//         System.out.println(fullName);
//     }
// }

//Find length of string
// import java.util.*;

// public class Strings {
//     public static void main(String[] args) {
//         String firstName = "tony";
//         String lastName = "stark";
//         String fullName = firstName + " " + lastName;
//         System.out.println(fullName.length());
//     }
// }

// //CharAt();
// import java.util.*;

// public class Strings {
//     public static void main(String[] args) {
//         String firstName = "tony";
//         String lastName = "stark";
//         String fullName = firstName + " " + lastName;
//         System.out.println(fullName.length());

//         for (int i = 0; i < fullName.length(); i++) {
//             System.out.println(fullName.charAt(i));
//         }
//     }
// }

//Comparing two string
// import java.util.*;

// public class Strings {
//     public static void main(String[] args) {
//         String name1 = "tony";
//         String name2 = "tony";

//         // 1 s2 > s2 : +ve value
//         // 2 s1 == s2 : 0
//         // 3 s1 < s2 : -ve value

//         // hello vs wello
//         // aahello vs aacallo

//         // if (name1.compareTo(name2) == 0) {
//         // System.out.println("Strings are equal");
//         // } else {
//         // System.out.println("Strings are not equal");
//         // }
//         // Strings are equal

//         // Without compareTo and diffrenece also,

//         // if (name1 == name2) {
//         // System.out.println("Strings are equal");
//         // } else {
//         // System.out.println("Strings are not equal");
//         // }
//         // Strings are equal

//         // New String
//         if (new String("Tony") == new String("Tony")) {
//             System.out.println("Strings are equal");
//         } else {
//             System.out.println("Strings are not equal");
//         }
//         // Strings are not equal

//     }
// }

//Sub String
import java.util.*;

public class Strings {
    public static void main(MyStringBuilder[] args) {
        // String sentence = "My name is tony";
        // String name = sentence.substring(11, sentence.length());
        // System.out.println(name);
        // tony
        // String sentence = "TomHardly";
        // String name = sentence.substring(3);
        // System.out.println(name);
        // //Hardly
        MyStringBuilder sentence = "TomHardly";
        MyStringBuilder name = sentence.substring(0, 3);
        System.out.println(name);
        // Tom
    }
}

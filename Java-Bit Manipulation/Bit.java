// Quick Revision
// left shift

// N<<i
// 2<<1

// right shift
// N>>i
// 2>>1

// bit opration
// 1. Get
// 2.Set
// 3.Clear
// 4.Update

//# Get Bit

// Get the 3rd bit (position = 2) of a number n. (n =0101)
// Bit Mask : 1<<i
// Operationn : AND

// step 1.
// 1<<2
// |
// 0001<<2
// |
// 0100
// step 2.
// 0100 AND 0101
// 0100 ---> checking value is non 0 or 1.
// 1 value

// more example
// step 1.
// 1<<3
// |
// 0001<<3
// |
// 1000
// step 2.
// 1000 AND 0101
// 0000 ---> checking value is non 0 or 1.
// 0 value

// import java.util.*;

// public class Bit {

//     public static void main(String[] args) {
//         int n = 5;// 0101
//         int pos = 3;
//         int bitMask = 1 << pos;

//         if ((bitMask & n) == 0) {
//             System.out.println("bit was zero");
//         } else {
//             System.out.println("bit was one");
//         }
//     }
// }

// # Set Bit

// set the 2nd bit (position = 1) of a number n. (n = 0101)
// Bit Mask : 1<<i
// operation : OR

// step 1.
// 1<<1
// |
// 0001<<1
// |
// 0010
// step 2.
// 0010 OR 0101
// 0111 ---> checking value is non 0 or 1.
// 1 value

// import java.util.*;

// public class Bit {

//     public static void main(String[] args) {
//         int n = 5;// 0101
//         int pos = 1;
//         int bitMask = 1 << pos;

//         int newNumber = bitMask | n;
//         System.out.println(newNumber);
//     }
// }
// 7

// # Clear Bit
// clear the 3nd bit (position = 2) of a number n. (n = 0101)
// Bit Mask : 1<<i
// operation : AND with NOT

// step 1.
// 1<<2
// |
// 0001<<1
// |
// 0100
// step 2.
// ~(0100) -> 1011 -> converting 0s to 1s
// (1011) & (0101)
// 0001 ---> checking value is non 0 or 1.
// 1 value

// import java.util.*;

// public class Bit {

//     public static void main(String[] args) {
//         int n = 5;// 0101
//         int pos = 2;
//         int bitMask = 1 << pos;
//         int notBitMask = ~(bitMask);

//         int newNumber = notBitMask & n;
//         System.out.println(newNumber);
//     }
// }

// # Update Bit

// Update the 2nd bit (position = 1) of a number n to 1. (n=0101)

// for 0
// bit Mask : 1<<i
// operation: AND With NOT

// for 1
// bit Mask : 1<<i
// operation: OR

// step 1.
// 1<<1
// |
// 0001<<1
// |
// 0010
// step 2.
// 0010 OR 0101
// 0111 ---> checking value is non 0 or 1.
// 1 value

import java.util.*;

public class Bit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();
        int n = 5;// 0101
        int pos = 1;
        int bitMask = 1 << pos;

        if (oper == 1) {
            // set
            int newNumber = bitMask | n;
            System.out.println(newNumber);
        } else {
            // clear
            int newBitMask = ~(bitMask);
            int newNumber = newBitMask & n;
            System.out.println(newNumber);
        }

    }
}

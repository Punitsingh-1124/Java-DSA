//In this file Arrays Problems with solution.

// Q1. Remove duplicate elements from a sorted array.(Easy) 

// public class ArraysQuestion {
//     public int removeDuplicates(int[] nums) {
//         int count = 1;
//         for (int i = 1; i < nums.length; i++) {
//             if (nums[i] != nums[i - 1]) {
//                 nums[count++] = nums[i];
//             }
//         }
//         return count;
//     }

//     public static void main(String[] args) {
//         ArraysQuestion solution = new ArraysQuestion();
//         int[] nums = { 1, 1, 2, 2, 3, 4, 4 };
//         int length = solution.removeDuplicates(nums);
//         System.out.println("Unique count: " + length);
//         for (int i = 0; i < length; i++) {
//             System.out.print(nums[i] + " ");
//         }
//     }
// }

// Unique count: 4
// 1 2 3 4 

// Q2. Best Time to Buy and Sell Stock. (Easy)

// public class ArraysQuestion {
//     public int maxProfit(int[] prices) {
//         int maxProfit = 0;
//         int bestBuy = prices[0];
//         for (int i = 1; i < prices.length; i++) {
//             if (prices[i] > bestBuy) {
//                 maxProfit = Math.max(maxProfit, prices[i] - bestBuy);
//             }
//             bestBuy = Math.min(prices[i], bestBuy);
//         }
//         return maxProfit;
//     }

//     public static void main(String[] args) {
//         // Example Test Case
//         ArraysQuestion solution = new ArraysQuestion();
//         int[] prices = { 7, 1, 5, 3, 6, 4 }; // Example array
//         int profit = solution.maxProfit(prices);

//         System.out.println("Max profit: " + profit);
//     }
// }

// Q3.Merge Sorted Array(easy)

// public class ArraysQuestion {
//     public void merge(int[] nums1, int m, int[] nums2, int n) {
//         int i = m - 1;
//         int j = n - 1;
//         int k = m + n - 1;

//         // Merge nums1 and nums2 starting from the end
//         while (j >= 0) {
//             if (i >= 0 && nums1[i] > nums2[j]) {
//                 nums1[k] = nums1[i];
//                 i--;
//             } else {
//                 nums1[k] = nums2[j];
//                 j--;
//             }
//             k--;
//         }
//     }

//     public static void main(String[] args) {
//         ArraysQuestion solution = new ArraysQuestion();

//         // Example inputs
//         int[] nums1 = { 1, 2, 3, 0, 0, 0 };
//         int m = 3;
//         int[] nums2 = { 2, 5, 6 };
//         int n = 3;

//         // Merge the arrays
//         solution.merge(nums1, m, nums2, n);

//         // Print the merged array
//         for (int num : nums1) {
//             System.out.print(num + " ");
//         }
//     }
// }

// Q4 Move Zeroes (easy)

// public class ArraysQuestion {
//     public void moveZeroes(int[] nums) {
//         int count = 0; // Pointer to place non-zero elements

//         // Move non-zero elements to the front
//         for(int i = 0; i < nums.length; i++) {
//             if(nums[i] != 0) {
//                 nums[count++] = nums[i]; // Put non-zero element in the correct position
//             }
//         }

//         // Fill remaining positions with zeros
//         while(count < nums.length) {
//             nums[count++] = 0;
//         }
//     }

//     public static void main(String[] args) {
//         ArraysQuestion solution = new ArraysQuestion();

//         // Example input
//         int[] nums = {0, 1, 0, 3, 12};

//         // Move zeroes to the end
//         solution.moveZeroes(nums);

//         // Print the updated array
//         for (int num : nums) {
//             System.out.print(num + " ");
//         }
//     }
// }

//Q5 Reverse String (easy)

// public class ArraysQuestion {
//     public void reverseString(char[] s) {
//         int i = 0;  // Start pointer
//         int j = s.length - 1;  // End pointer

//         // Swap characters until the pointers meet in the middle
//         while (i <= j) {
//             char temp = s[i];
//             s[i] = s[j];
//             s[j] = temp;
//             i++;
//             j--;
//         }
//     }

//     public static void main(String[] args) {
//         Solution solution = new Solution();

//         // Example input
//         char[] s = {'h', 'e', 'l', 'l', 'o'};

//         // Reverse the string
//         solution.reverseString(s);

//         // Print the reversed array
//         System.out.println(s);
//     }
// }

//Q6 Remove Element(easy)
public class ArraysQuestion {
    public int removeElement(int[] nums, int val) {
        int count = 0; // Pointer to place elements that are not equal to 'val'

        // Traverse through the array
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[count] = nums[i]; // Place the element at the correct position
                count++;
            }
        }

        return count; // Return the length of the array without 'val'
    }

    public static void main(String[] args) {
        ArraysQuestion solution = new ArraysQuestion();

        // Example input
        int[] nums = { 3, 2, 2, 3, 4 };
        int val = 3;

        // Call removeElement
        int newLength = solution.removeElement(nums, val);

        // Print the new array and its length
        System.out.println("New length: " + newLength);
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}

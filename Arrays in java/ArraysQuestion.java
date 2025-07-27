// In this file Arrays Problems with solution.

// Q1. Remove duplicate elements from a sorted array.(Easy)

// public class ArraysQuestion {
// public int removeDuplicates(int[] nums) {
// int count = 1;
// for (int i = 1; i < nums.length; i++) {
// if (nums[i] != nums[i - 1]) {
// nums[count++] = nums[i];
// }
// }
// return count;
// }

// public static void main(String[] args) {
// ArraysQuestion solution = new ArraysQuestion();
// int[] nums = { 1, 1, 2, 2, 3, 4, 4 };
// int length = solution.removeDuplicates(nums);
// System.out.println("Unique count: " + length);
// for (int i = 0; i < length; i++) {
// System.out.print(nums[i] + " ");
// }
// }
// }

// Unique count: 4
// 1 2 3 4

// Q2. Best Time to Buy and Sell Stock. (Easy)

// public class ArraysQuestion {
// public int maxProfit(int[] prices) {
// int maxProfit = 0;
// int bestBuy = prices[0];
// for (int i = 1; i < prices.length; i++) {
// if (prices[i] > bestBuy) {
// maxProfit = Math.max(maxProfit, prices[i] - bestBuy);
// }
// bestBuy = Math.min(prices[i], bestBuy);
// }
// return maxProfit;
// }

// public static void main(String[] args) {
// // Example Test Case
// ArraysQuestion solution = new ArraysQuestion();
// int[] prices = { 7, 1, 5, 3, 6, 4 }; // Example array
// int profit = solution.maxProfit(prices);

// System.out.println("Max profit: " + profit);
// }
// }

// Q3.Merge Sorted Array(easy)

// public class ArraysQuestion {
// public void merge(int[] nums1, int m, int[] nums2, int n) {
// int i = m - 1;
// int j = n - 1;
// int k = m + n - 1;

// // Merge nums1 and nums2 starting from the end
// while (j >= 0) {
// if (i >= 0 && nums1[i] > nums2[j]) {
// nums1[k] = nums1[i];
// i--;
// } else {
// nums1[k] = nums2[j];
// j--;
// }
// k--;
// }
// }

// public static void main(String[] args) {
// ArraysQuestion solution = new ArraysQuestion();

// // Example inputs
// int[] nums1 = { 1, 2, 3, 0, 0, 0 };
// int m = 3;
// int[] nums2 = { 2, 5, 6 };
// int n = 3;

// // Merge the arrays
// solution.merge(nums1, m, nums2, n);

// // Print the merged array
// for (int num : nums1) {
// System.out.print(num + " ");
// }
// }
// }

// Q4 Move Zeroes (easy)

// public class ArraysQuestion {
// public void moveZeroes(int[] nums) {
// int count = 0; // Pointer to place non-zero elements

// // Move non-zero elements to the front
// for(int i = 0; i < nums.length; i++) {
// if(nums[i] != 0) {
// nums[count++] = nums[i]; // Put non-zero element in the correct position
// }
// }

// // Fill remaining positions with zeros
// while(count < nums.length) {
// nums[count++] = 0;
// }
// }

// public static void main(String[] args) {
// ArraysQuestion solution = new ArraysQuestion();

// // Example input
// int[] nums = {0, 1, 0, 3, 12};

// // Move zeroes to the end
// solution.moveZeroes(nums);

// // Print the updated array
// for (int num : nums) {
// System.out.print(num + " ");
// }
// }
// }

// Q5 Reverse String (easy)

// public class ArraysQuestion {
// public void reverseString(char[] s) {
// int i = 0; // Start pointer
// int j = s.length - 1; // End pointer

// // Swap characters until the pointers meet in the middle
// while (i <= j) {
// char temp = s[i];
// s[i] = s[j];
// s[j] = temp;
// i++;
// j--;
// }
// }

// public static void main(String[] args) {
// Solution solution = new Solution();

// // Example input
// char[] s = {'h', 'e', 'l', 'l', 'o'};

// // Reverse the string
// solution.reverseString(s);

// // Print the reversed array
// System.out.println(s);
// }
// }

// Q6 Remove Element(easy)
// public class ArraysQuestion {
// public int removeElement(int[] nums, int val) {
// int count = 0; // Pointer to place elements that are not equal to 'val'

// // Traverse through the array
// for (int i = 0; i < nums.length; i++) {
// if (nums[i] != val) {
// nums[count] = nums[i]; // Place the element at the correct position
// count++;
// }
// }

// return count; // Return the length of the array without 'val'
// }

// public static void main(String[] args) {
// ArraysQuestion solution = new ArraysQuestion();

// // Example input
// int[] nums = { 3, 2, 2, 3, 4 };
// int val = 3;

// // Call removeElement
// int newLength = solution.removeElement(nums, val);

// // Print the new array and its length
// System.out.println("New length: " + newLength);
// for (int i = 0; i < newLength; i++) {
// System.out.print(nums[i] + " ");
// }
// }
// }

// Q7 Max Consecutive Ones(easy)
// public class ArraysQuestion {

// public int findMaxConsecutiveOnes(int[] nums) {
// int curr_count = 0;
// int max_count = 0;

// // Iterate through all elements in the array
// for (int i = 0; i < nums.length; i++) {
// if (nums[i] == 1) {
// curr_count++;
// max_count = Math.max(max_count, curr_count);
// } else {
// curr_count = 0;
// }
// }

// return max_count;
// }

// public static void main(String[] args) {
// // Create an instance of the class to call the method
// ArraysQuestion solution = new ArraysQuestion();

// // Test case for the LeetCode problem 485
// int[] nums = { 1, 1, 0, 1, 1, 1 };
// int result = solution.findMaxConsecutiveOnes(nums);

// // Output the result
// System.out.println("Max Consecutive Ones: " + result);
// }
// }

// Q8 Missing Number(easy)
// class Solution {
// public int missingNumber(int[] nums) {
// int n = nums.length;
// return (n * (n + 1)) / 2 - Arrays.stream(nums).sum();
// }
// } ///// this is easyest ans of this code in leetcode but its take time to rum
// because arethmetic logic

// or

// public class ArraysQuestion {

// // Method to find the missing number
// public int missingNumber(int[] nums) {
// // Initialize the sum variable
// int sum = 0;

// // Loop through the array to calculate the sum of the elements
// for (int i = 0; i < nums.length; i++) {
// sum = sum + nums[i];
// }

// // Calculate the actual sum of numbers from 0 to n (inclusive)
// int actualSum = (nums.length * (nums.length + 1)) / 2;

// // The missing number is the difference between the expected sum and the
// actual
// // sum
// int missingnum = actualSum - sum;

// return missingnum;
// }

// public static void main(String[] args) {
// // Create an instance of ArraysQuestion to call the missingNumber method
// ArraysQuestion solution = new ArraysQuestion();

// // Example test case: [3, 0, 1]
// int[] nums = { 3, 0, 1 };

// // Call the missingNumber method and store the result
// int missing = solution.missingNumber(nums);

// // Print the result
// System.out.println("Missing number: " + missing); // Output: 2
// }
// }

// Q9 Single Number(easy)
// public class ArraysQuestion {
// public int singleNumber(int[] nums) {
// // Initialize count to 0
// int count = 0;

// // Loop through all the numbers in the array
// for (int i = 0; i < nums.length; i++) {
// // XOR each number with the current value of count
// count ^= nums[i];
// }

// // The final result will be the number that appears only once
// return count;
// }

// public static void main(String[] args) {
// // Create an instance of Solution to call the singleNumber method
// ArraysQuestion solution = new ArraysQuestion();

// // Example test case: [4, 1, 2, 1, 2]
// int[] nums = { 4, 1, 2, 1, 2 };

// // Call the singleNumber method and store the result
// int single = solution.singleNumber(nums);

// // Print the result
// System.out.println("Single number: " + single); // Output: 4
// }
// }

// // Q10 Array Reverse
// import java.util.*;

// public class ArraysQuestion {

// public static void dispaly(int[] arr) {
// for (int i = 0; i < arr.length; i++) {
// System.out.print(arr[i] + " ");
// }
// }

// public static void main(String[] args) {
// int[] arr = { 1, 2, 3, 4, 5 };
// int left = 0, right = arr.length - 1;
// System.out.println("Original arrays:");
// dispaly(arr);
// while (left < right) {
// int temp = arr[left];
// arr[left] = arr[right];
// arr[right] = temp;
// left++;
// right--;
// }
// System.out.println("\nreversed arrays:");
// dispaly(arr);
// }
// }
// Original arrays:
// 1 2 3 4 5
// reversed arrays:
// 5 4 3 2 1

// Q11 Maximum and minimum of an array using minimum number of comparisons
// import java.util.*;

// public class ArraysQuestion {
//     public static void findMinMax(int[] arr) {
//         if (arr == null || arr.length == 0)
//             return;
//         int min = arr[0];
//         int max = arr[0];
//         for (int i = 1; i < arr.length; i++) {
//             if (arr[i] < min) {
//                 min = arr[i];
//             }
//             if (arr[i] > max) {
//                 max = arr[i];
//             }
//         }
//         System.out.println(max + " maximum");
//         System.out.println(min + " minimum");
//     }

//     public static void main(String[] args) {
//         int[] arr = { 6, 2, 3, 4, 1, 9 };
//         findMinMax(arr);
//     }
// }
// 9 maximum
// 1 minimum

//Or Short code using Math()
import java.util.*;

public class ArraysQuestion {
    public static void findMinMax(int[] arr) {
        if (arr == null || arr.length == 0)
            return;
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
            max = Math.max(max, arr[i]);
        }
        System.out.println(max + " maximum");
        System.out.println(min + " minimum");
    }

    public static void main(String[] args) {
        int[] arr = { 6, 2, 3, 4, 1, 9 };
        findMinMax(arr);
    }
}
// 9 maximum
// 1 minimum


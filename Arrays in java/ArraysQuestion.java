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

public class ArraysQuestion {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int bestBuy = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > bestBuy) {
                maxProfit = Math.max(maxProfit, prices[i] - bestBuy);
            }
            bestBuy = Math.min(prices[i], bestBuy);
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        // Example Test Case
        ArraysQuestion solution = new ArraysQuestion();
        int[] prices = { 7, 1, 5, 3, 6, 4 }; // Example array
        int profit = solution.maxProfit(prices);

        System.out.println("Max profit: " + profit);
    }
}

// Q3.

//Seach value in the range.
import java.util.*;

public class SearchInRange {
    public static int linearSearchAlgo(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }

        // run a for loop
        for (int index = start; index <= end; index++) {
            // check for element at every at every index if it is = target
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }

        // this line will execute if none of the return statement above have executed
        // hence the target not found
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 18, 12, -7, 3, 14, 28 };
        int target = 18;
        System.out.println(linearSearchAlgo(arr, target, 1, 4));
    }
}
// 3
// not in 1 to 4 index range 18 is index 0 value that why -1.
 
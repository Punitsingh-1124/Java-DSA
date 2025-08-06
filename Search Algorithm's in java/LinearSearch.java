import java.util.*;;

public class LinearSearch {
    // search in the array : return the index if item in found
    // otherwise if item not found return -1.
    public static int linearSearchAlgo(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        // run a for loop
        for (int index = 0; index < arr.length; index++) {
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
        int[] arr = { 23, 45, 1, 2, 8, 19, -3, 16, -11, 28 };
        int target = 19;

        int ans = linearSearchAlgo(arr, target);
        System.out.println(ans);
    }

}
// 5 index on that place 19 present
// if nothing found target value in arr then -1.
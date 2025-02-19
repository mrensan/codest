package net.ensan.codest.etc.dp;

/**
 * Requirement:
 * Trapping Rainwater Problem states that given an array of n non-negative integers arr[]
 * representing an elevation map where the width of each bar is 1, compute how much water
 * it can trap after rain.
 *
 * Examples:
 * Input: arr[] = [3, 0, 1, 0, 4, 0, 2]
 * Output: 10
 *
 *      #
 *  #www#
 *  #www#w#
 *  #w#w#w#
 */
public class TrappingRainwater {

    public static void main(String[] args) {
        System.out.println(new TrappingRainwater().calculateTrappingWater(new int[] {3, 0, 1, 0, 4, 0, 2}));
        System.out.println(new TrappingRainwater().calculateTrappingWaterOptimized(new int[] {3, 0, 1, 0, 4, 0, 2}));
    }

    /**
     * The solution falls under the Dynamic Programming (DP) / Precomputed Arrays category, but
     * it can also be classified under Two-Pass Techniques or Prefix-Suffix Computation.
     * Time Complexity: O(n)
     * Space Complexity: O(n) (due to maxLeft and maxRight arrays)
     */
    public int calculateTrappingWater(int[] arr) {
        int[] maxLeft = new int[arr.length];
        maxLeft[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            maxLeft[i] = Math.max(arr[i], maxLeft[i - 1]);
        }
        int[] maxRight = new int[arr.length];
        maxRight[arr.length - 1] = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            maxRight[i] = Math.max(arr[i], maxRight[i + 1]);
        }
        int water = 0;
        for (int i = 0; i < arr.length; i++) {
            int columWater = (Math.min(maxLeft[i], maxRight[i]) - arr[i]);
            if (columWater > 0) {
                water += columWater;
            }
        }
        return water;
    }

    /**
     * Instead of maintaining two separate arrays (maxLeft and maxRight), use two pointers (left and right)
     * that move toward each other.
     * Maintain two variables, leftMax and rightMax, to track the max height on both sides.
     * The key observation: The amount of trapped water at an index depends on the smaller of the two boundaries.
     * If leftMax < rightMax, process the left pointer; otherwise, process the right pointer.
     */
    public int calculateTrappingWaterOptimized(int[] arr) {
        int left = 0, right = arr.length - 1;
        int leftMax = 0, rightMax = 0;
        int water = 0;

        while (left < right) {
            if (arr[left] < arr[right]) {
                if (arr[left] >= leftMax) {
                    leftMax = arr[left];  // Update left boundary
                } else {
                    water += leftMax - arr[left];  // Calculate trapped water
                }
                left++;  // Move left pointer
            } else {
                if (arr[right] >= rightMax) {
                    rightMax = arr[right];  // Update right boundary
                } else {
                    water += rightMax - arr[right];  // Calculate trapped water
                }
                right--;  // Move right pointer
            }
        }
        return water;
    }
}

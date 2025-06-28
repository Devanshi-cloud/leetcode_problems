import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int n = nums.length;
        Integer[] indices = new Integer[n];
        for (int i = 0; i < n; i++) {
            indices[i] = i;
        }

        // Sort indices based on the values in nums
        Arrays.sort(indices, (i1, i2) -> nums[i2] - nums[i1]);

        // Select the top k indices
        Integer[] topKIndices = Arrays.copyOfRange(indices, 0, k);

        // Sort the top k indices to maintain original order
        Arrays.sort(topKIndices);

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = nums[topKIndices[i]];
        }

        return result;
    }
}

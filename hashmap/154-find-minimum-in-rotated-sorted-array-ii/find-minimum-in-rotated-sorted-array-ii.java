class Solution {
    public int findMin(int[] nums) {
        int st = 0, end = nums.length - 1;
        while (st < end) {
            int mid = st + (end - st) / 2;
            if (nums[mid] > nums[end]) {
                // min is in right half
                st = mid + 1;
            } else if (nums[mid] < nums[end]) {
                // min is in left half including mid
                end = mid;
            } else {
                // nums[mid] == nums[end] -> cannot decide, shrink end safely
                end--;
            }
        }
        return nums[st];
    }
}

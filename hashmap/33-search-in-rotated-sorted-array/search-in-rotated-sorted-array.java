class Solution {
    public int search(int[] nums, int k) {
        int st = 0, end = nums.length - 1;
        
        while (st <= end) {
            int mid = st + (end - st) / 2;
            
            if (nums[mid] == k) return mid;
            
            
            if (nums[st] <= nums[mid]) {
                if (nums[st] <= k && k < nums[mid]) {
                    end = mid - 1;
                } else {
                    st = mid + 1;
                }
            }
           
            else {
                if (nums[mid] < k && k <= nums[end]) {
                    st = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}

class Solution {
    public int pivotIndex(int[] nums) {
        int leftSum = 0;
        int rightSum = 0;
        for(int k:nums){
            rightSum+=k;
        }
        int val = 0;
        int ans = -1;
        for(int i=0; i<nums.length; i++){
            val = nums[i];
            rightSum -= nums[i];
            if(leftSum == rightSum){
                ans = i;
                break;
            }
            leftSum += nums[i];
        }
        return ans;
    }
}
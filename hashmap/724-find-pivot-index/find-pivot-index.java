class Solution {
    public int pivotIndex(int[] nums) {
        int rightsum = 0;
        for(int num:nums){
            rightsum+=num;
        }
        int leftsum = 0;
        int ans = -1;
        for(int i=0; i<nums.length; i++){
            int val = nums[i];
            rightsum-=val;
            
            if(leftsum == rightsum){
                ans = i;
                break;
            }
            leftsum += val;
        }
        return ans;
    }
}
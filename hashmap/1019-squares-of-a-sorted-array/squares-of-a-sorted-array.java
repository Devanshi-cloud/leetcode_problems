class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        for(int i = 0; i<n; i++){
            nums[i] = nums[i]*nums[i];
        }
        int[] ans = new int[n];
        int i = 0;
        int j = nums.length -1;
        for(int k = n-1; k>=0; k--)
        {
            if(nums[j]>nums[i]){
            ans[k] = nums[j];
            j--;
        }
        else{
            ans[k] = nums[i];
            i++;
        }
        }
        return ans;
    }
}
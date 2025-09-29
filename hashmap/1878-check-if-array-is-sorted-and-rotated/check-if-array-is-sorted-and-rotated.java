class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        int st = 0;

        boolean k = true;
        for(int i = 0; i<n; i++){
            if(nums[i] > nums[(i+1) % n ])
            {
                st++;
            }
            if(st>1){
                k = false;
            }
        }
        return k;
    }
}
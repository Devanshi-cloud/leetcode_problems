class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int maj = nums[0];
        int vot =1;
        for(int i = 1; i<n; i++){
            if(nums[i] != maj){
                vot -= 1;
                if(vot == 0){
                    maj = nums[i];
                    vot = 1;
                }
            }
            else{
                vot++;
            }
        }
        return maj;
    }
}
class Solution {
    public int search(int[] nums, int target) {
        int st = 0; 
        int n = nums.length;
        int end = n-1;
        int ans = 0;
        while(st<=end){
            int mid = st + (end-st)/2;

            if(target == nums[mid]){
                return mid;
            }
            else if(target>nums[mid]){
                st = mid+1;
                
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }
}
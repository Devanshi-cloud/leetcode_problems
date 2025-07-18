class Solution {
    public int[] twoSum(int[] nums, int target) {
        int temp = 0;
        Map<Integer, Integer> ans = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            int comp = target - nums[i];
            if(ans.containsKey(comp)){
                return new int[] {ans.get(comp), i}; 
            }
            else
            {
                ans.put(nums[i],i);
            }
        }
        return new int[]{};
    }
}
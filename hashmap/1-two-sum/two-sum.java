class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        Map<Integer, Integer> ans = new HashMap<>();
        for(int i=0; i<n; i++){
            int comp = target-nums[i];
            if(ans.containsKey(comp)){
                return new int[]{ans.get(comp), i};
            }
            else ans.put(nums[i], i);
        }
        return new int[]{};
    }
}
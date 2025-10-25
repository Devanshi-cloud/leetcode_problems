class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i = 0; i<n; i++){
            int comp = target - nums[i];
            if(mp.containsKey(comp)){
                return new int[]{mp.get(comp)+1, i+1};
            }
            else{
                mp.put(nums[i], i);
            }
        }
        return new int[]{};
    }
}
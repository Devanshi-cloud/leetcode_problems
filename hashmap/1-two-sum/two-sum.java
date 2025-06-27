class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> find = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            int comp = target-nums[i];
            if(find.containsKey(comp)) {
                return new int[]{find.get(comp), i}; 
            }else{
            find.put(nums[i], i);
            }
        }
        return new int[]{};
    }
}
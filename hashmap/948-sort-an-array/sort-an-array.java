class Solution {
    public int[] sortArray(int[] nums) {
        PriorityQueue<Integer> maxh = new PriorityQueue<>();
        int[] arr = new int[nums.length];
        for(int num:nums){
            maxh.add(num);

        }
        int i = 0;
        while(!maxh.isEmpty()){
            arr[i++] = maxh.poll();
            
        }
        return arr;
    }
}

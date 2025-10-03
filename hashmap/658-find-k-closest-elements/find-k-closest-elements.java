class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<int[]> maxh = new PriorityQueue<>((a, b) -> (a[0] == b[0]) ? b[1] - a[1] : b[0] - a[0]);
        ArrayList<Integer> ans = new ArrayList<>();
        for(int num : arr){
            maxh.add(new int[]{Math.abs(num - x), num});
            if(maxh.size() > k){
                maxh.poll();
            }
        }
        
        while(!maxh.isEmpty()){
            ans.add(maxh.poll()[1]);
            
        }
        Collections.sort(ans);
        return ans;
    }
}
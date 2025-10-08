class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
       Map<Integer, Integer> hash = new HashMap<>();
       Stack<Integer> st = new Stack<>();
       for(int i = nums2.length-1; i>=0; i--){
            int num = nums2[i];
            while(!st.isEmpty() && st.peek() <= num){
                st.pop();
            }
            
                hash.put(num, st.isEmpty() ? -1 : st.peek());
            
            st.push(num);
       }
       int[] ans = new int[nums1.length];
       for(int i=0; i<nums1.length; i++){
            ans[i] = hash.get(nums1[i]);
       }
       return ans;
    }
}
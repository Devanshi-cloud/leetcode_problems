class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
        Stack<Integer> st = new Stack<Integer>();

        int n= nums2.length;

        for(int i = n-1; i>=0; i--){
            int num = nums2[i];
            while(!st.isEmpty() && st.peek() <= num){
                st.pop();
            }

            // if(!st.isEmpty() && st.peek>num){
               
            // }
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

// initialize
// traverse nums2
// pop smaller numbers
// empty condition
// stack push

// get ready as per nums2


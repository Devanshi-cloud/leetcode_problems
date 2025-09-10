class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        
        int[] left = computeLeft(heights);
        int[] right = computeRight(heights);
        
        int maxArea = 0;
        
        for (int i = 0; i < n; i++) {
            int width = right[i] - left[i] - 1;
            int area = heights[i] * width;
            maxArea = Math.max(maxArea, area);
        }
        
        return maxArea;
    }

        private int[] computeLeft(int[] heights){
        int n =heights.length;
        int[] left = new int[n];
        int pseudo = -1;
        Stack<int[]> st = new Stack<int[]>();
        for(int i=0; i<n; i++){
            int num = heights[i];
            while(!st.isEmpty() && st.peek()[0] >= num){
                st.pop();
            }

            if(i<n){
                left[i] = st.isEmpty() ? pseudo : st.peek()[1];
            }
             st.push(new int[]{num, i});
        }
        return left;
        }
        private int[] computeRight(int[] heights){
            int n = heights.length;
        int pseudo = n;
        Stack<int[]> st = new Stack<int[]>();
        int[] right = new int[n];
        for(int i=n-1; i>=0; i--){
            int num = heights[i];
            while(!st.isEmpty() && st.peek()[0] >= num){
                st.pop();
            }

            if(i>=0){
                right[i] = st.isEmpty() ? pseudo : st.peek()[1];
            }
            st.push(new int[]{num, i});
        }
        return right;
        }
}

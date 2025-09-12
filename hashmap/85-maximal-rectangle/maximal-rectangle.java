class Solution {
    public int maximalRectangle(char[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }
        int n = matrix.length;
        int m = matrix[0].length;
        int mx= 0;

        int[] hist = new int[m];

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(matrix[i][j] == '0')
                    hist[j] = 0;
                
                else
                    hist[j] += 1;
            }

            int histo = Max_Area_Histogram(hist);
            mx = Math.max(histo, mx);
        }

        return mx;
    }

    private int Max_Area_Histogram(int[] hist){
        int[] Left = composeLeft(hist);
        int[] Right = composeRight(hist);
        int n = hist.length;
        int mx =0;

        int[] width = new int[n];
        for(int i=0; i<n; i++){
            width[i] = Right[i] - Left[i] - 1;
        }

        int ans[] = new int[n];
        for(int i=0; i<n; i++){
            ans[i] = width[i] * hist[i];
            mx = Math.max(mx, ans[i]);
        }

        return mx;
    }

    private int[] composeLeft(int[] hist){
        int n=hist.length;
        Stack<Integer> st = new Stack<Integer>();
        int pseudo = -1;
        int ans[] = new int[n];

        for(int i=0; i<n; i++){
           while(!st.isEmpty() && hist[st.peek()] >= hist[i]){
            st.pop();
           }

           ans[i] = st.isEmpty() ? pseudo : st.peek();
           st.push(i);
        }
        return ans;
    }

    private int[] composeRight(int[] hist){
        int n = hist.length;
        Stack<Integer> st = new Stack<Integer>();
        int pseudo = n;
        int ans[] = new int[n];

        for(int i=n-1; i>=0; i--){
            while(!st.isEmpty() && hist[st.peek()] >= hist[i]){
                st.pop();
            }
            ans[i] = st.isEmpty() ? pseudo : st.peek();
            st.push(i);
        }
        return ans;
    }
}
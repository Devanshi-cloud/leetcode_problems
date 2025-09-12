class Solution {
    public int trap(int[] ht) {
        int n = ht.length;
        int[] mxl = new int[n];
        int[] mxr = new int[n];
        int[] wtr = new int[n];
        int[] ans = new int[n];

        mxl[0] = ht[0];
        for(int i=1; i<n; i++){
            mxl[i] = Math.max(mxl[i-1], ht[i]);
        }

        mxr[n-1] = ht[n-1];
        for(int i=n-2; i>=0; i--){
            mxr[i] = Math.max(mxr[i+1], ht[i]);
        }  

        for(int i=0; i<n; i++){
            wtr[i] = Math.min(mxr[i], mxl[i]) - ht[i];
        }

        int sum = 0;
        for(int i=0; i<n; i++){
            sum+=wtr[i];
            ans[i] = sum;
        }
        int res = 0;
        for(int i =0; i<ans.length; i++){
            res = Math.max(ans[i], res);
        }
        return res;
    }
}
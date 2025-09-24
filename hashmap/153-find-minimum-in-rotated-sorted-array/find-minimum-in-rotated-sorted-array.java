class Solution {
    public int findMin(int[] arr) {
        if(arr.length == 0){
            return -1;
        }
        int st = 0;
        int n = arr.length;
        int end = n-1;
        int ans = 0;
        if (arr[st] <= arr[end]) return arr[st];
        while(st<=end){
            int mid = st + (end -st)/2;
            if(mid < end && arr[mid] > arr[mid+1]){
                return arr[mid+1];
            
            }
            if(mid > st && arr[mid] < arr[mid-1]){
                return arr[mid];
            }
            if(arr[mid] <= arr[st]){
                end = mid-1;
            }
            else {
                st = mid+1;
            }
            
        }
        return -1;
    }
}
class Solution {
    public int findMin(int[] arr) {
        int st = 0;
        int n = arr.length;
        int end = n-1;
        while(st<=end){
            int mid = st + (end -st)/2;
            if(arr[mid]>arr[end]){
                st=mid+1;
            }
            else if(arr[mid]<arr[end]){
                end=mid;
            }
            else{
                end --;
            }
        }
        return arr[st];
    }
}
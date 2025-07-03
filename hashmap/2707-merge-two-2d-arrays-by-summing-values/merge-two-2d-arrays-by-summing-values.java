class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        Map<Integer, Integer> map = new TreeMap<>(); //Map is the function calling map is the number we're using new    TreeMap

        for(int[] pair: nums1){ // single 1d array in a 2d one in nums1
            map.put(pair[0], map.getOrDefault(pair[0], 0)+pair[1]);// I'll put these numbers into the map
        }
        for(int[] pair: nums2){
            map.put(pair[0], map.getOrDefault(pair[0], 0)+pair[1]);// either key found value or 0+pair[1];
        }
        int[][] res = new int[map.size()][2]; //intialising a 2d array with size equal to the map and 1 array with 2 values each inside a 2d array
        int i=0;
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){ //Map is a function whose Entries are getting stored in entry a 1d array pair till each entrySet() size;
            res[i][0] = entry.getKey(); //each entrySet is getting stored i res.
            res[i][1] = entry.getValue();
            i++; // 1st pair 2nd pair 3rd pair
        }
        return res;
    }
}
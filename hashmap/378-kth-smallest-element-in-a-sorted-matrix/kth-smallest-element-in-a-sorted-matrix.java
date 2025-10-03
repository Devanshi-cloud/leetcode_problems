class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> maxh = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j<matrix[0].length; j++){
                maxh.add(matrix[i][j]);
                if(maxh.size()>k){
                    maxh.poll();
                }
            }
        }
        return maxh.peek();
    }
}
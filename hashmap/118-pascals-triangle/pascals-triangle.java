class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        if(numRows == 0){
            return res;
        }
        List<Integer> Fr = new ArrayList<>();
        Fr.add(1);
        res.add(Fr);
        if(numRows == 1){
            return res;
        }
        for(int i =2; i<=numRows; i++){
            List<Integer> curr = new ArrayList<>();
            curr.add(1);
            for(int j =1 ; j<i-1; j++){
                curr.add(res.get(i-2).get(j-1) + res.get(i-2).get(j));
            }
            curr.add(1);
            res.add(curr);
        }
        return res;
    }
}
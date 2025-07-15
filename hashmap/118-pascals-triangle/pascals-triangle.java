class Solution {
    public List<List<Integer>> generate(int numsRows) {
        List<List<Integer>> res = new ArrayList<>();
        if(numsRows == 0){
            return res;
        }
        List<Integer> prev = new ArrayList<>();
        prev.add(1);
            res.add(prev);
        if(numsRows == 1){
            return res;
        }
        
        for(int i = 2; i<=numsRows; i++){
            List<Integer> curr = new ArrayList<>();
            curr.add(1);
            for(int j = 1; j<i-1; j++){
                curr.add(res.get(i-2).get(j-1) + res.get(i-2).get(j));
            }
            curr.add(1);
            res.add(curr);
        }
        return res;
    }
}
class Solution {
    private Map<Character, String> d2c = Map.of('2', "abc", '3', "def", '4', "ghi", '5', "jkl", '6', "mno", '7', "pqrs", '8', "tuv", '9', "wxyz");

    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if (digits.length() == 0) {
            return ans;
        }
        String curr = "";
        backtrack(digits, ans, curr, d2c, 0);
        return ans;
    }

    public void backtrack(String digits, List<String> ans, String curr, Map d2c, int index) {
        if (curr.length() == digits.length()) {
            ans.add(curr);
            return;
        } else if (index >= digits.length()) {
            return;
        } else {
            String digit = (String) d2c.get(digits.charAt(index));
            for (int i = 0; i < digit.length(); i++) {
                backtrack(digits, ans, curr + digit.charAt(i), d2c, index + 1);
            }
        }
    }
}

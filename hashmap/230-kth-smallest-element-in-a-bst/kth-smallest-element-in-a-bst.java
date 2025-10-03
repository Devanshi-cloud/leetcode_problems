/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int kthSmallest(TreeNode root, int k) {
        PriorityQueue<Integer> maxh = new PriorityQueue<>(Collections.reverseOrder());
        traverse(root, maxh, k);
        return maxh.peek();
    }
    private void traverse(TreeNode root, PriorityQueue<Integer> maxh, int k){
        if(root == null) return;
        maxh.add(root.val);
        if(maxh.size()>k){
            maxh.poll();
        }
        traverse(root.left, maxh, k);
        traverse(root.right, maxh, k);
    }
}
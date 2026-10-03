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
    int maxLen;
    public int diameter(TreeNode root){
        if(root==null){
            return 0;
        }
        int l=diameter(root.left);
        int r=diameter(root.right);
        maxLen=Math.max(maxLen,r+l);
        return Math.max(l,r)+1;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        
        diameter(root);
        return maxLen;
    }
}
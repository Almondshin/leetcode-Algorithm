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
    int count = 0;
    public int maxDepth(TreeNode root) {
        if(root == null){
          return 0;
        }
        
        int leftDepth = maxDepth(root.left); 
        int rightDepth = maxDepth(root.right);
        
        if(leftDepth > rightDepth){
            return leftDepth + count+1;
        }else{
            return rightDepth + count+1;
        }
        
    }
}
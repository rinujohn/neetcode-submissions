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
    boolean valid = true;
    public boolean isBalanced(TreeNode root) {
        dfs(root);
        return this.valid;
    }
    public int dfs(TreeNode root){
        if (root == null){
            return 0;
        }
        int left_height = dfs(root.left);
        int right_height = dfs(root.right);
        if(Math.abs(left_height - right_height)>1){
            this.valid = false;
        }

        return 1 + Math.max(left_height, right_height);
    }
}

/*

valid

dfs(root):
    if(root = None):
        retun 0
    print(root.val)
    left_height = dfs(root.left)
    right_height = dfs(root.right)
    if((left_height - right_height) >1):
        self.valid = False
    return 1+ max(left_height,right_height)

*/
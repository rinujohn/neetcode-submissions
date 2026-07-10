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
    boolean result = true;
    public boolean isSameTree(TreeNode p, TreeNode q) {
        this.dfs(p,q);

return result;
    }
    public void dfs(TreeNode nodeOne ,TreeNode nodeTwo){
        if (nodeOne == null || nodeTwo == null){
            if(!(nodeOne == null && nodeTwo == null)){
                this.result = false;
            }
            return;
        }
        if(nodeOne.val != nodeTwo.val){
            this.result = false;
        }
        this.dfs(nodeOne.left, nodeTwo.left);
        this.dfs(nodeOne.right, nodeTwo.right);
    }
}


/*
same tree or not,
do a DFS
on both tree togther, if any state are not equal return false
if dfs executed without error return true. 
create a global varaible to track

*/
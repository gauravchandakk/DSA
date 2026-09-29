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
    public int minDepth(TreeNode root) {
        if(root==null)
        return 0;
        return min(root,1);
    }
    int min(TreeNode root,int h){
        if(root==null)
        return 0;
        if(root.left==null &&  root.right==null)
        return 1;
        if(root.left==null)
        return h+=min(root.right,h);
        if(root.right==null)
        return h+=min(root.left,h);
        h+=Math.min(min(root.left,h),min(root.right,h));
        return h;
    }
}
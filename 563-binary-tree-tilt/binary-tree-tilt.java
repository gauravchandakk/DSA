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
    public int findTilt(TreeNode root) {
        find(root);
        return ans(root);
    }
    public int ans(TreeNode root){
        if(root==null)
        return 0;
        return root.val+ans(root.left)+ans(root.right);
    }
    public int find(TreeNode root) {
        if(root==null)
        return 0;
        int sum=root.val;
        int left=find(root.left);
        int right=find(root.right);
        root.val=Math.abs(left-right);
        sum+=left+right;
        return  sum;
    }
}
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
    int diameter=0;
    public int diameterOfBinaryTree(TreeNode root) {
        cal(root);
        return diameter;
    }
    public int cal(TreeNode root){
        if(root==null)
        return 0;

        int  left=cal(root.left);
        int  right=cal(root.right);

        int dia=left+right;
        diameter=Math.max(diameter,dia);
        return Math.max(left,right)+1;
         
    }
}
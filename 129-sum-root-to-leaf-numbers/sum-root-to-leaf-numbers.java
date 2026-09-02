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
   
    public int sumNumbers(TreeNode root) {
        return  sumNumbers(root,0);
    }
    public int sumNumbers(TreeNode root,int sum) {
        if(root==null)
        return sum;
        sum=(sum*10)+root.val;
        if(root.left!=null && root.right!=null)
        sum=sumNumbers(root.left,sum)+sumNumbers(root.right,sum);
        else if(root.left!=null && root.right==null)
        sum=sumNumbers(root.left,sum);
        else if(root.left==null && root.right!=null)
        sum=sumNumbers(root.right,sum);
        
        return sum;
    }
    
}
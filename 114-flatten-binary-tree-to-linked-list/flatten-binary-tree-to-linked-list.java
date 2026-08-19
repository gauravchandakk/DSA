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
    Queue<TreeNode> q=new LinkedList<>();
    public void flatten(TreeNode root) {
        if(root==null)
        return;
        preOrder(root);
        root.left=null;
        q.poll();
        while(!q.isEmpty()){
            root.right=q.poll();
            root=root.right;
            root.left=null;
        }
        return;
    }
    public void preOrder(TreeNode root){
        if(root==null)
        return;
        q.offer(root);
        preOrder(root.left);
        preOrder(root.right);
        return;

    }
}
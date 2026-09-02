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
        List<String> list=new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        binaryTreePaths(root,new StringBuilder());
        return list;
    }
    public void binaryTreePaths(TreeNode root,StringBuilder s) {
        if(root==null)
            return;
        int l=s.length();
        if(l>0)
            s.append("->");
        s.append(root.val);
        binaryTreePaths(root.left,s);
        binaryTreePaths(root.right,s);

        if(root.left==null && root.right==null)
            list.add(s.toString());
        
        s.delete(l,s.length());
        
        
        return;

    }

}
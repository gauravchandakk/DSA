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
    public boolean isSymmetric(TreeNode root) {
        Queue<TreeNode> q1 = new LinkedList<>();
        Queue<TreeNode> q2 = new LinkedList<>();
        if (root.left == null && root.right == null)
            return true;
        if (root.left != null && root.right != null) {
            q1.offer(root.left);
            q2.offer(root.right);
        } else
            return false;
        while (!q1.isEmpty() && !q2.isEmpty()) {
            if (q1.size() != q2.size())
                return false;
            int size = q1.size();
            for (int i = 0; i < size; i++) {
                TreeNode n1 = q1.poll();
                TreeNode n2 = q2.poll();
                if (n1.val != n2.val)
                    return false;
                if (n1.left != null && n2.right != null) {
                    q1.offer(n1.left);
                    q2.offer(n2.right);
                } else if (n1.left == null && n2.right == null){
                    
                }
                else
                    return false;
                if (n1.right != null && n2.left != null) {
                    q1.offer(n1.right);
                    q2.offer(n2.left);
                } else if (n1.right == null && n2.left == null)
                    continue;
                else
                    return false;
            }
        }
        return true;

    }
}
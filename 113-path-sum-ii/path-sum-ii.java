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
    List<List<Integer>> list=new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<Integer> list2=new ArrayList<>();
        pathSum(root,0,targetSum,list2);
        return list;
    }
    public void pathSum(TreeNode root, int sum,int targetSum,List<Integer> list2) {
        if(root==null)
        return;
        sum+=root.val;
        list2.add(root.val);
        if(root.left==null && root.right==null && sum==targetSum){
            list.add(new ArrayList<>(list2));
            list2.remove(list2.size()-1);
            return;
        }
        if(root.left==null && root.right==null){
           
            list2.remove(list2.size()-1);
            return;
        }
        
        
        pathSum(root.left,sum,targetSum,list2);
        pathSum(root.right,sum,targetSum,list2);
        list2.remove(list2.size()-1);
        return;
    }
}
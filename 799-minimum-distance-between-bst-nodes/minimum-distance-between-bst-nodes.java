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
    public int minDiffInBST(TreeNode root) {
        ArrayList<Integer> list=new ArrayList<>();
        list=inOrder(root,list);
        return diff(list,0,100001);

    }
    public  ArrayList<Integer> inOrder(TreeNode root,ArrayList<Integer> list){
        if(root==null)
        return list;
        inOrder(root.left,list);
        list.add(root.val);
        inOrder(root.right,list);
        return list;
    }
    public int diff(ArrayList<Integer> list,int i, int dif){
        if(i==list.size()-1){
            return  dif;
        }
        dif=Math.min(list.get(i+1)-list.get(i),dif);
        dif=Math.min(diff(list,i+1,dif),dif);
        return  dif;
    }
}
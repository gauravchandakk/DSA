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
    public void recoverTree(TreeNode root) {
        ArrayList<TreeNode>  list=new ArrayList<>();
        list=inOrder(root,list);
        int temp;
        int i=0,j=list.size()-1;
        while(i<j){
            if(list.get(i).val>list.get(i+1).val && list.get(j-1).val>list.get(j).val)
            break;

            if(list.get(i).val<list.get(i+1).val){
                i++;
            }
            
            
            if(list.get(j-1).val<list.get(j).val){
                j--;
            }
        }
        temp=list.get(i).val;
        list.get(i).val=list.get(j).val;
        list.get(j).val=temp;
        
    }
    public ArrayList<TreeNode> inOrder(TreeNode root,ArrayList<TreeNode> list){
        if(root==null)
        return list;
        list=inOrder(root.left,list);
        list.add(root);
        list=inOrder(root.right,list);
        return list;
    }
}
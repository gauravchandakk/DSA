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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list=new ArrayList<>();
        if(root ==null)
        return list;

        Queue<TreeNode> q=new LinkedList<>();
            boolean b=false;
        q.offer(root);
        while(!q.isEmpty()){
            int size=q.size();
            List<Integer> list2=new ArrayList<>(size);
            for(int i=0;i<size;i++){
                TreeNode node=q.poll();;
                if(node.right!=null)
                q.offer(node.right);
                if(node.left!=null)
                q.offer(node.left);
                list2.add(node.val);
                

            }
            if(b){
                b=false;
            }
            else{
                b=true;
                Collections.reverse(list2);
            }

            list.add(list2);
        }
        return list;
        
    }
}
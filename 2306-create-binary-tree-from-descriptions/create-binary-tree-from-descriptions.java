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
    public TreeNode createBinaryTree(int[][] descriptions) {
        HashMap<Integer,TreeNode> map=new HashMap<>();
        HashSet <Integer> set=new HashSet<>();
        TreeNode root=new TreeNode(descriptions[0][0]);
        for(int i=0;i<descriptions.length;i++){
            int p=descriptions[i][0];
            int c=descriptions[i][1];
            int d=descriptions[i][2];
            set.add(c);
            if(map.containsKey(p)){
                TreeNode temp=map.get(p);
                if(map.containsKey(c)){
                    if(d==1){
                        TreeNode l=map.get(c);
                        temp.left=l;
                    }
                    else{
                        TreeNode r=map.get(c);
                        temp.right=r;

                    }
                }
                else{
                    map.put(c,new TreeNode(c));
                    
                    if(d==1){
                        TreeNode l=map.get(c);
                        temp.left=l;
                    }
                    else{
                        TreeNode r=map.get(c);
                        temp.right=r;

                    }

                }
            }
            else{
                root=new TreeNode(p);
                map.put(p,root);
                TreeNode temp=map.get(p);
                if(map.containsKey(c)){
                    if(d==1){
                        TreeNode l=map.get(c);
                        temp.left=l;
                    }
                    else{
                        TreeNode r=map.get(c);
                        temp.right=r;

                    }
                }
                else{
                    map.put(c,new TreeNode(c));
                    
                    if(d==1){
                        TreeNode l=map.get(c);
                        temp.left=l;
                    }
                    else{
                        TreeNode r=map.get(c);
                        temp.right=r;

                    }

                }
            }
        }
        for(int i=0;i<descriptions.length;i++){
            if(!set.contains(descriptions[i][0])){
                return map.get(descriptions[i][0]);
            }
        }
        return root;
    }
}
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root==null)
        return "null";
        Queue<TreeNode> q=new LinkedList<>();
        StringBuilder sb=new StringBuilder();
        q.offer(root);
        while(!q.isEmpty()){
            // int size=q.size();
            // for(int i=0;i<size;i++){
                TreeNode temp=q.poll();
                if(temp==null){
                    sb.append("null,");
                    continue;
                }
                q.offer(temp.left);
                q.offer(temp.right);
                sb.append(temp.val).append(",");
                
            // }
        }
        return  sb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data.equals("null,")||data.equals("null"))
            return null;
        String[] arr=data.split(",");
        TreeNode root=new TreeNode();
        root.val=Integer.parseInt(arr[0]);
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        int i=1;
        while(!q.isEmpty() || i>arr.length){
            // int size=q.size();
            // for(int j=0;j<size;j++){
                TreeNode temp=q.poll();
                if(!arr[i].equals("null")){
                    temp.left=new TreeNode(Integer.parseInt(arr[i]));
                    q.offer(temp.left);

                }
                i++;
                if(!arr[i].equals("null")){
                    temp.right=new TreeNode(Integer.parseInt(arr[i]));
                    q.offer(temp.right);
                }
                i++;
                

            // }
        }
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));
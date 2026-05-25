/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        
        while(l1!=null){
            q1.add(l1.val);
            l1=l1.next;
        }
        while(l2!=null){
            q2.add(l2.val);
            l2=l2.next;
        }
        int carry=0;
        while(!q1.isEmpty() || !q2.isEmpty() ||carry!=0){
            ListNode node=new ListNode();
            if(q1.isEmpty() && q2.isEmpty()){
                
            }
            else if(q1.isEmpty()){
                carry+=q2.remove();
            }
            else if(q2.isEmpty()){
                carry+=q1.remove();

            }
            else{
                carry+= q1.remove()+q2.remove();
            }
            node.val=carry%10;
            if(l1==null){
                l1=node;
                l2=node;
            }
            else{

            l2.next=node;
            l2=l2.next;
            }
            carry/=10;
            

        }
        return l1;

    }
}
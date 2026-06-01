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
    public void reorderList(ListNode head) {
        ListNode temp=head;
        ListNode temp2=head;

        while(temp2.next!=null && temp2.next.next!=null){
            temp=temp.next;
            temp2=temp2.next.next;
        }
        temp2=temp;
        temp=temp.next;
        temp2.next=null;
        
        Stack<Integer> s=new Stack<>();
        while(temp!=null){
            s.push(temp.val);
            temp=temp.next;
            
        }
        temp=head;
        
        while(!s.empty()){
            
            ListNode node=new ListNode(s.pop());
            node.next=temp.next;
            temp.next=node;
            temp=node.next;
        }
        
        
        
    }
}
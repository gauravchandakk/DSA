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
    public ListNode deleteMiddle(ListNode head) {
        if(head.next==null)
        return head.next;
        ListNode s=head;
        ListNode f=new ListNode(-1);
        f.next=head;
        while(s!=null && s.next!=null ){
            f=f.next;
            s=s.next.next;
        }
        
        f.next=f.next.next;
        return head;
        
    }
}
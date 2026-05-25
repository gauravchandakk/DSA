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
        ListNode f=head;
        ListNode s=head;
        while(s!=null && s.next!=null && s.next.next!=null){
            f=f.next;
            s=s.next.next;
        }
        if(s.next==null){
            s=f;
            f=head;
            while(f.next!=s){
                f=f.next;
            }
        }
        f.next=f.next.next;
        return head;
        
    }
}
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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null)
        return head;
        ListNode a=new ListNode();
        a.next=head;
        ListNode b=head;
        Boolean c=false;
        while(b.next!=null){
            if(a.next.val==b.next.val){
                b=b.next;
                c=true;
            }
            else if(c==true && a.next==head ){
                a.next=b.next;
                
                b=b.next;
                head=b;
                c=false;
            }
            else if(c==true ){
                a.next=b.next;
                b=b.next;
                c=false;
            }
            else{
                a=a.next;
                b=b.next;
            }
        }
        if(a.next!=b && a.next.val==b.val){
            a.next=null;
        }
        if(head.val==b.val && head.next!=null)
        return null;
        return head;
        
    }
}
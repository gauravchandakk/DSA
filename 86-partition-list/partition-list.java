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
    public ListNode partition(ListNode head, int x) {
        if(head==null ||  head.next==null)
        return head;
        ListNode a=new ListNode();
        Boolean c=false;
        if(head.val>=x){
            a.next=head;
            c=true;
        }
        else
        a = head;
        

        while (a.next != null) {
            if (a.next.val >= x)
                break;
            a = a.next;
        }
        if(a.next==null)
        return head;
        ListNode b = a.next;
        while (b.next != null) {
            if (b.next.val < a.next.val && b.next.val<x) {
                ListNode temp = b.next;
                if (temp.next == null) {
                    b.next = null;
                } else {

                    b.next = temp.next;
                }
                temp.next = a.next;
                a.next = temp;
                if(c==true){

                head=temp;
                c=false;
                }

                a = a.next;
            } else {

                b = b.next;
            }

        }
        return head;
    }
}
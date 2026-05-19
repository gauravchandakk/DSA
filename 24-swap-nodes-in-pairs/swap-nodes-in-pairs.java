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
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null)
        return head;
        ListNode temp1=head.next;
        ListNode temp2=temp1.next;
        head.next=temp2;
        temp1.next=head;
        head=temp1;
        try{
            
        rec(temp1.next,temp2,temp2.next);
        }
        catch(NullPointerException e) {

        return head;

        }
        return head;
    }
    public void rec(ListNode temp,ListNode temp1,ListNode temp2){
        if(temp1==null || temp2==null)
        return;
        temp.next=temp2;
        temp=temp2.next;
        temp1.next=temp;
        temp2.next=temp1;
        try {

     rec(temp2.next,temp1.next,temp.next);
}
catch(NullPointerException e) {

    return;

}
       
        return;

    }
    

}
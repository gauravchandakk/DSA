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
    public ListNode mergeNodes(ListNode head) {
        ListNode temp=head;
        Boolean a=false;
        while(temp.next!=null){
            if(a==false && temp.val==0){
                a=true;
                
            }
            else if(a==true && temp.next.val!=0){
                temp.val+=temp.next.val;
                temp.next=temp.next.next;
            }
            else if(a==true && temp.next.val==0 && temp.next.next==null){
                temp.next=null;
                a=false;
            }
            else if(a==true && temp.next.val==0){
                temp=temp.next;
                a=false;
            }
            
        }
        return head;
    }
}
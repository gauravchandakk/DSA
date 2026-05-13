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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null)
        return list2;
        if(list2==null)
        return list1;
        if(list1.val<=list2.val){
            merge(list1,list2);
            return list1;
        }
        else{
            merge(list2,list1);
            return list2;
        }
        

    }
    public void merge(ListNode temp1,ListNode temp2){
        if(temp1.next==null){
            temp1.next=temp2;
            return;
        }
        ListNode temp=null;
        
        if(temp1.next.val>temp2.val){
            temp=temp1.next;
            temp1.next=temp2;
            temp2=temp;
        }
        
        merge(temp1.next,temp2);
        return;

    }
}
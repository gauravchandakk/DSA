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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode temp1=list1;
        ListNode temp2=list2;
        int i=0;
        while(i!=b+1){
            if(i==a-1){
                temp2=temp1;
            }
            temp1=temp1.next;
            i++;
        }
        temp2.next=list2;
        while(temp2.next!=null){
            temp2=temp2.next;
        }
        temp2.next=temp1;
        return list1;
    }
}
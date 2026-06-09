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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode temp=head;
        int count=1;
        while(count!=left){
            temp=temp.next;
            count++;
        }
        Stack<Integer> s=new Stack<>();
        while(count!=right+1){
            s.push(temp.val);
            temp=temp.next;
            count++;
        }
        temp=head;
        count=1;
        while(count!=left){
            temp=temp.next;
            count++;
        }
        
        while(count!=right+1){
            temp.val=s.pop();
            temp=temp.next;
            count++;
        }
        return head;

    }
    
}
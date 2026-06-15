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
    public int pairSum(ListNode head) {
        ListNode temp=head;
        ListNode temp2=head;
        while(temp2.next.next!=null){
            temp=temp.next;
            temp2=temp2.next.next;
        }
        temp2=head;
            temp=temp.next;
        Stack <Integer> s=new Stack<>();
        while(temp!=null){
            s.push(temp.val);
            temp=temp.next;
        }
        int sum=0, maxSum=Integer.MIN_VALUE;
        while(!s.isEmpty()){
            sum=temp2.val+s.pop();
            maxSum=Math.max(sum,maxSum);
            temp2=temp2.next;

        }
        return maxSum;
        
    }
}
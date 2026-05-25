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
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        Stack<Integer> stack = new Stack<>();
        ListNode temp =new ListNode();
        while(head.next!=null){
            stack.push(head.val);
            head=head.next;
        }
        
        r(stack,head,head);
        return  head;

        
    }
    
    public void r(Stack<Integer> stack,ListNode head,ListNode temp){
        if(stack.empty()){
            return;
        }
        if(head==null){
            ListNode node=new ListNode();
            head=node;
            head.val=stack.pop();
           
            temp=head;
        }
        else{
            ListNode node=new ListNode();
            temp.next=node;
            node.val=stack.pop();
            temp=temp.next;
        }
        r(stack,head,temp);
        return;
        
    }
}
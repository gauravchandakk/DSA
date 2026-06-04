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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k==0)
            return head;
        ListNode a = head;
        ListNode b = head;
        int size = 0;

        while (a != null) {
            size++;
            a = a.next;
        }
        if (k > size) {
            k = k % size;
            k = size - k;
        } else {
            k = size - k;
        }
        if(k==size || k==0)
        return  head;
        

        a = head;

        while (k > 0) {
            b = a;
            a = a.next;
            k--;
        }
        b.next = null;
        b = a;

        while (a.next != null) {
            a = a.next;
        }
        a.next = head;
        return b;

    }
}
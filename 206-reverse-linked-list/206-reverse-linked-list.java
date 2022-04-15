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
        
       if(head == null || head.next == null){
            return head;
        }
        
        ListNode temp;
        ListNode curr = head.next;
        ListNode sort = head;
        sort.next = null;
        
        while(curr != null){
            temp = curr.next;
            curr.next = sort;
            sort = curr;
            curr = temp;
        }
        return sort;
        
     
    }
        
}
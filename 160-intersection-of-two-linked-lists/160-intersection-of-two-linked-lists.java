/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode n1 =headA;
        ListNode n2 =headB;
        while(n1!=n2)
        {
            if(n1!=null)
                n1 = n1.next;
            else
                n1 = headB;
            
            if(n2!=null)
                n2 = n2.next;
            else
                n2 = headA;
            
            
        }
        return n1;
    }
}
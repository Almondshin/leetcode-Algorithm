/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
       if(head == null || head.next == null){
           return false;
       }
        HashSet<ListNode> lnset = new HashSet<>();
        while(head.next != null){
            if(lnset.contains(head)){
                return true;
            }else{
                lnset.add(head);
            }
            head = head.next;
        }
        return false;
    }

}
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
       ListNode answer = new ListNode();
        ListNode a = answer;
        ListNode a1 = list1;
        ListNode a2 = list2;
        
        while(a1 != null && a2 != null){
            if(a1.val < a2.val){
                a.next = a1;
                a1 = a1.next;
            }else{
                a.next = a2;
                a2 = a2.next;
            }
            a = a.next;
        }
        if(a1 != null){
            a.next = a1;
        }
         if(a2 != null){
            a.next = a2;
        }
        return answer.next;
    }
}
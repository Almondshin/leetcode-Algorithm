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
     			ListNode head = new ListNode();
		ListNode cur;
		
		// 		시작점			조건				
		for (cur = head; list1 != null && list2 != null;) {
			if (list1.val > list2.val) {
				cur.next = list2;
				list2 = list2.next;
			} else {
				cur.next = list1;
				list1 = list1.next;
			}
			cur = cur.next;		//한칸 전진의 초석
		}
		if(list1 != null) {
			cur.next = list1;
		}
		if(list2 != null) {
			cur.next = list2;
		}
		
		return head.next;
        
    }
}
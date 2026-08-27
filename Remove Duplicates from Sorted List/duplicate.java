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
    public ListNode deleteDuplicates(ListNode head) {
        int prev = Integer.MIN_VALUE, curr = 0;

        ListNode ans = null;
        ListNode head_ans = ans;

        while (head != null) {
            curr = head.val;
            if (curr == prev) {
                head = head.next;
            } else {
                ListNode T = new ListNode(curr);
        
                if (ans == null) {
                    ans = T;
                    head_ans = T;
                } else {
                    head_ans.next = T;
                    head_ans = T;
                }
                head = head.next;
                prev = curr;
            }
        }
        return ans;
    }
}
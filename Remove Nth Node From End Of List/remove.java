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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count = 0;
        ListNode ans = null;
        ListNode head_ans = ans;
        ListNode temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        int iter = 0;
        while (head != null) {
            if (iter != count - n) {
                ListNode T = new ListNode(head.val);

                if(head_ans != null) {
                   head_ans.next = T;
                   head_ans = T;
                } else {
                    ans = T;
                    head_ans = T;
                }   
            }
            head = head.next;
            iter++;
        }
        return ans;
    }
}
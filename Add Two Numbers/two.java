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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum = 0, carry = 0;
        ListNode ans =  null;
        ListNode head_1 = l1;
        ListNode head_2 = l2;
        ListNode head_ans = ans;

        while (head_1 != null || head_2 != null || carry != 0) {
            ListNode T = new ListNode(0);
            if(head_1 != null && head_2 != null) {
               sum = head_1.val + head_2.val + carry;
               head_1 = head_1.next;
               head_2 = head_2.next;               
            } else if(head_1 != null) {
               sum = head_1.val + carry;
               head_1 = head_1.next;
            } else if(head_2 != null)  { 
               sum = head_2.val + carry;
               head_2 = head_2.next;
            } else {
               sum = carry; 
            }
     
            carry = sum / 10;
            T.val = sum % 10;

            if(head_ans == null) {
                head_ans = T;
                ans = T;
            } else {
                head_ans.next = T;
                head_ans = head_ans.next ;
            }
            

        }
        return ans;
    }
}
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

        if(head == null){
            return null;
        }

        ArrayList <Integer> it = new ArrayList<>();

        while(head != null){
            it.add(head.val);
            head = head.next;
        }

        head = new ListNode(it.get(it.size() - 1));
        ListNode ans = head;

        for(int i = it.size() - 2; i >= 0; i--){
            head.next = new ListNode(it.get(i));
            head = head.next;
        }
        return ans;
    }
}
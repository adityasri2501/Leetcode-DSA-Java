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
    public ListNode sortList(ListNode head) {

        if(head == null){
            return null;
        }

        ArrayList<Integer> item = new ArrayList<>();

        while(head != null){
            item.add(head.val);
            head = head.next;
        }

        Collections.sort(item);

        head = new ListNode (item.get(0));
        ListNode ans = head;

        for(int i = 1; i< item.size(); i++){
            head.next = new ListNode();
            head = head.next;
            head.val = item.get(i);
        }
        return ans;
    }
}
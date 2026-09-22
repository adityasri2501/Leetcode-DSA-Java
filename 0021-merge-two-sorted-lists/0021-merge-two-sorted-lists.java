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

        if (list1 == null) {
            if (list2 == null) {
                return null;
            } else {
                return list2;
            }
        } else {
            if (list2 == null) {
                return list1;
            }
        }

        ListNode res = new ListNode();
        ListNode ans = res;

        if(list1.val <= list2.val){
            res.val = list1.val;
            list1 = list1.next;
        }else{
            res.val = list2.val;
            list2 = list2.next;
        }
        
        // System.out.println(res.val);

        while (list1 != null && list2 != null) {
            // System.out.println(res.val);
            res.next = new ListNode();
            res = res.next;
            if (list1.val <= list2.val) {
                res.val = list1.val;
                list1 = list1.next;
            } else {
                res.val = list2.val;
                list2 = list2.next;
            }
        }

        if (list1 == null) {
            if (list2 != null) {
                while(list2 != null){
                    res.next = new ListNode();
                    res = res.next;
                    res.val = list2.val;
                    list2 = list2.next;
                }
            }
        } else {
            if (list2 == null) {
                while(list1 != null){
                    res.next = new ListNode();
                    res = res.next;
                    res.val = list1.val;
                    list1 = list1.next;
                }
            }
        }

        return ans;
    }
}
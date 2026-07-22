class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution_Rn {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head.next == null) {
            return null;
        }
        ListNode curr = head;
        ListNode prev;
        while (curr != null) {
            prev = curr.next;
            curr = curr.next;
        }
        return head;
    }
}

// public class removeNthNode {
//     public static void main(String[] args) {
//         Solution_Rn solution = new Solution_Rn();
//         ListNode head = new ListNode(1);
//         head.next = new ListNode(2);
//         head.next.next = new ListNode(3);
//         head.next.next.next = new ListNode(4);
//         head.next.next.next.next = new ListNode(5);
//         head = solution.removeNthFromEnd(head, 2);
//         System.out.println(head);
//     }
// }
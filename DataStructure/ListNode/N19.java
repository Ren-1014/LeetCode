
public class N19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);
        ListNode cur = dummy;
        // if (head == null) {
        // return null;
        // }
        ListNode l1 = head;
        int length = 0;
        while (l1 != null) {
            l1 = l1.next;
            length++;
        }

        for (int i = 1; i < length - n + 1; ++i) {
            cur = cur.next;
        }
        cur.next = cur.next.next;
        return dummy.next;
        // if (length == n) {
        // head = head.next;
        // return head;
        // }
        // int num = length - n;
        // ListNode l2 = head;
        // while (num-- > 0) {
        // l2 = l2.next;
        // }

        // l2.next = l2.next.next;
        // return head;

    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class N141 {
    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }
        ListNode fast = head;
        ListNode slow = head.next;
        while (fast != slow) {
            if (fast == null || slow == null || fast.next == null) {
                return false;
            } else {
                fast = fast.next.next;
                slow = slow.next;
            }
        }

        return true;
    }
}

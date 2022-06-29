package ListNode;

public class N83 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode temp = head;
        while (temp.next != null) {
            if (temp.val == temp.next.val) {
                temp.next = temp.next.next;
                temp.next = null;
            } else {
                temp = temp.next;
            }
        }
        return head;
        // if (head == null) {
        // return head;
        // }

        // ListNode cur = head;
        // while (cur.next != null) {
        // if (cur.val == cur.next.val) {
        // cur.next = cur.next.next;
        // } else {
        // cur = cur.next;
        // }
        // }
        // return head;

    }
}
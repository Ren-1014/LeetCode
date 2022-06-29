package ListNode;

public class N206 {
    public ListNode reverseList(ListNode head) {
        // if (head == null) {
        // return null;
        // }
        // ArrayList<ListNode> arr = new ArrayList<>();
        // int i = 0;
        // while (head != null) {
        // arr.add(i, head);
        // i++;
        // head = head.next;
        // }
        // ListNode temp = null;
        // for (; i >= 0; --i) {
        // temp = arr.get(arr.size() - i - 1);
        // temp = temp.next;
        // }
        // return temp;

        // if (head == null || head.next == null) {
        // return head;
        // }
        // ListNode newhead = reverseList(head.next);

        // ListNode temp = head.next;
        // temp.next = head;
        // head.next = null;
        // return newhead;

        ListNode l1 = null;
        ListNode l2 = head;
        while (l2 != null) {
            ListNode next = l2.next;
            l2.next = l1;
            l1 = l2;
            l2 = next;

            // l1 = next;
            // l1.next = l2;
            // l2 = next;
        }
        return l1;
    }
}

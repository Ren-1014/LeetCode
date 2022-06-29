package ListNode;

public class N21 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null)
            return list2;
        if (list2 == null)
            return list1;

        if (list1.val < list2.val) {
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoLists(list2.next, list1);
            return list2;
        }

        // while (l1 != null && l2 != null) {
        // if (l1.val <= l2.val) {
        // prev.next = l1;
        // l1 = l1.next;
        // } else {
        // prev.next = l2;
        // l2 = l2.next;
        // }
        // prev = prev.next;
        // }

        // // 合并后 l1 和 l2 最多只有一个还未被合并完，我们直接将链表末尾指向未合并完的链表即可
        // prev.next = l1 == null ? l2 : l1;

        // return prehead.next;

    }
}
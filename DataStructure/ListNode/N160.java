package ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) {
 * val = x;
 * next = null;
 * }
 * }
 */
public class N160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // ListNode l1 = headA, l2 = headB;
        // while (l1 != l2) {
        // l1 = (l1 == null) ? headB : l1.next;
        // l2 = (l2 == null) ? headB : l2.next;
        // }
        // return l1;
        Set<ListNode> visited = new HashSet<ListNode>();
        ListNode l1 = headA;
        while (l1 != null) {
            visited.add(l1);
            l1 = l1.next;
        }
        ListNode l2 = headB;

        while (l2 != null) {
            if (visited.contains(l2)) {
                return l2;
            }
            l2 = l2.next;
        }

        return null;
    }

}

package org.gleison.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * #21
 * https://leetcode.com/problems/merge-two-sorted-lists/description/
 * <p>
 * You are given the heads of two sorted linked lists list1 and list2.
 * Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.
 * Return the head of the merged linked list.
 */

class MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        // dealing with some null corner cases
        if ((list1 == null) && (list2 == null)) {
            return null;
        } else if (list1 == null) {
            return list2;
        } else if (list2 == null) {
            return list1;
        }

        ListNode list3 = new ListNode(); // new head

        ListNode l1 = list1;
        ListNode l2 = list2;
        ListNode l3 = list3;

        Boolean hasNext = true;
        do {
            if ((l1 != null) && (l2 != null)) {
                if (l1.val < l2.val) {
                    l3.val = l1.val;
                    l1 = l1.next;
                } else {
                    l3.val = l2.val;
                    l2 = l2.next;
                }
            } else if (l1 != null) {
                l3.val = l1.val;
                l1 = l1.next;
            } else {
                l3.val = l2.val;
                l2 = l2.next;
            }

            hasNext = ((l1 != null) || (l2 != null));
            if (hasNext) {
                l3.next = new ListNode();
                l3 = l3.next;
            }
        } while (hasNext);

        return list3;
    }

    public static class ListNode {

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

        public static Integer[] listNodeToArray(ListNode ln) {
            List<Integer> al = new ArrayList<>();

            while (ln != null) {
                al.add(ln.val);
                ln = ln.next;
            }

            return al.toArray(new Integer[0]);
        }

    }

}
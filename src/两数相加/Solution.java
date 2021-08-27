package 两数相加;

/**
 * https://leetcode-cn.com/problems/add-two-numbers/
 * <p>
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        l2.val = l1.val + l2.val;
        if (l2.val >= 10) {
            l2.val = l2.val % 10;
            if (l2.next != null) {
                l2.next.val = l2.next.val + 1;
                if (l2.next.val == 10) {
                    l2.next = addTwoNumbers(new ListNode(0, null), l2.next);
                }
            } else {
                l2.next = new ListNode(1, null);
            }
        }
        l2.next = addTwoNumbers(l1.next, l2.next);
        return l2;
    }

    public class ListNode {
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
}

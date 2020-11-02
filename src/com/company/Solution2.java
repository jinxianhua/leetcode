package com.company;

import java.util.HashMap;
import java.util.Map;

/**
 * @author kim 金仙华
 * @date 2020/10/22
 */
public class Solution2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode f = l1;
        int i = 0;
        for (; ; ) {
            l1.val = (l1.val + (l2 != null ? l2.val : 0) + i);
            i = l1.val / 10;
            l1.val = l1.val % 10;
            if (l1.next == null) {
                if ((l2 == null || l2.next == null) && i == 0) {
                    break;
                }
                l1.next = new ListNode();
            }
            l2 = l2 != null ? l2.next : null;
            l1 = l1.next;
        }
        return f;
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


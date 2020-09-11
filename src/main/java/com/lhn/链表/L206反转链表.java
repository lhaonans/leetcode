package com.lhn.链表;

import com.lhn.global.ListNode;

/**
 * @author lhn
 * @date 2020/9/10 23:04
 */
public class L206反转链表 {
    public ListNode reverseList(ListNode head) {

        ListNode prev = null;
        while (head != null) {
            ListNode temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }
        return prev;
    }
}

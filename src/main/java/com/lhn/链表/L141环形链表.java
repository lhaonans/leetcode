package com.lhn.链表;

import com.lhn.global.ListNode;

import java.util.HashSet;

/**
 * @author lhn
 * @date 2020/8/23 10:36
 */
public class L141环形链表 {
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> listNodes = new HashSet<>();
        while (head != null) {
            if (listNodes.contains(head)) {
                return true;
            } else {
                listNodes.add(head);
            }
            head = head.next;
        }
        return false;
    }
}

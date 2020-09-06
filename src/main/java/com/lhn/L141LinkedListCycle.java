package com.lhn;

import com.lhn.global.ListNode;

import java.util.HashSet;

/**
 * @author lhn
 * @date 2020/8/23 10:36
 */
public class L141LinkedListCycle {

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(3);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(0);
        ListNode listNode4 = new ListNode(4);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode2;

        L141LinkedListCycle l141LinkedListCycle = new L141LinkedListCycle();
        System.out.println(l141LinkedListCycle.hasCycle(listNode1));
    }

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

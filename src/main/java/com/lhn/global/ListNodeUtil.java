package com.lhn.global;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lhn
 * @date 2020/8/28 13:38
 */
public class ListNodeUtil {
    public static ListNode arrayToListNode(int[] array) {
        ListNode listNode = new ListNode();
        ListNode next = listNode;
        for (int i : array) {
            next.next = new ListNode(i);
            next = next.next;
        }
        return listNode.next;
    }

    public static List<Integer> ListNodeToArray(ListNode listNode) {
        ArrayList<Integer> ints = new ArrayList<>();
        while (listNode != null) {
            ints.add(listNode.val);
            listNode = listNode.next;
        }
        return ints;
    }
}

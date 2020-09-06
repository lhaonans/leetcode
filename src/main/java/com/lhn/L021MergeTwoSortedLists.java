package com.lhn;

import com.lhn.global.ListNodeUtil;
import com.lhn.global.ListNode;

/**
 * @author lhn
 * @date 2020/8/28 13:30
 */
public class L021MergeTwoSortedLists {
    public static void main(String[] args) {
        ListNode listNode1 = ListNodeUtil.arrayToListNode(new int[]{1, 2, 4});
        ListNode listNode2 = ListNodeUtil.arrayToListNode(new int[]{1, 3, 4});
        ListNode listNode = new L021MergeTwoSortedLists().mergeTwoLists(listNode1, listNode2);
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode listNode = new ListNode();
        ListNode pre = listNode;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                pre.next = l1;
                l1 = l1.next;
            } else {
                pre.next = l2;
                l2 = l2.next;
            }
            pre = pre.next;
        }
        if (l1 == null) {
            pre.next = l2;
        } else {
            pre.next = l1;
        }
        return listNode.next;
    }
}

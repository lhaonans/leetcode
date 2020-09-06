package com.lhn;

import com.lhn.global.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lhn
 * @date 2020/8/23 13:35
 */
public class L234PalindromeLinkedList {
    public static void main(String[] args) {

        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(2);
        listNode.next.next.next = new ListNode(1);
        System.out.println(new L234PalindromeLinkedList().isPalindrome(listNode));
    }

    public boolean isPalindrome(ListNode head) {
        List<Integer> integers = new ArrayList<>();
        while (head != null) {
            integers.add(head.val);
            head = head.next;
        }
        int front = 0;
        int back = integers.size() - 1;
        while (front < back) {
            if (!integers.get(front).equals(integers.get(back))) {
                return false;
            }
            front++;
            back--;
        }
        return true;
    }
}

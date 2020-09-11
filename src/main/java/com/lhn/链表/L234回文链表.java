package com.lhn.链表;

import com.lhn.global.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lhn
 * @date 2020/8/23 13:35
 */
public class L234回文链表  {


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

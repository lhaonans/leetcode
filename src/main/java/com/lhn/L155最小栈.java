package com.lhn;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lhn
 * @date 2020/9/10 23:02
 */
public class L155最小栈 {
    private List<Integer> list;
    private int size;

    /**
     * initialize your data structure here.
     */
    public L155最小栈() {
        list = new ArrayList<>();
        size = 0;
    }

    public void push(int x) {
        list.add(size, x);
        size++;

    }

    public void pop() {
        size--;
    }

    public int top() {
        return list.get(size - 1);
    }

    public int getMin() {
        int min = list.get(0);
        for (int i = 0; i < size; i++) {
            min = Math.min(list.get(i), min);
        }
        return min;
    }
}

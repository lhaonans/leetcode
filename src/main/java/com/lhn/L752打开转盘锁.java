package com.lhn;

import java.util.*;

/**
 * @author lhn
 * @date 2020/8/24 14:19
 */
public class L752打开转盘锁 {

    public int openLock(String[] deadends, String target) {

        Set<String> dead = new HashSet<>(Arrays.asList(deadends));
        Set<String> visited = new HashSet<>();
        Queue<String> queue = new LinkedList<>();

        int res = 0;

        queue.offer("0000");
        visited.add("0000");

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                String poll = queue.poll();

                if (dead.contains(poll)) {
                    continue;
                }
                if (poll.equals(target)) {
                    return res;
                }

                for (int j = 0; j < 4; j++) {
                    String plus = plus(poll, j);
                    String subtract = subtract(poll, j);

                    if (!visited.contains(plus)) {
                        queue.offer(plus);
                        visited.add(plus);
                    }
                    if (!visited.contains(subtract)) {
                        queue.offer(subtract);
                        visited.add(subtract);
                    }
                }
            }
            res++;
        }
        return -1;
    }

    public String plus(String str, int index) {
        char[] chars = str.toCharArray();
        if (chars[index] == '9') {
            chars[index] = '0';
        } else {
            chars[index] += 1;
        }
        return new String(chars);
    }

    public String subtract(String str, int index) {
        char[] chars = str.toCharArray();
        if (chars[index] == '0') {
            chars[index] = '9';
        } else {
            chars[index] -= 1;
        }
        return new String(chars);
    }
}

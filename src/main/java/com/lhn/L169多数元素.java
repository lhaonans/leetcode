package com.lhn;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lhn
 * @date 2020/9/10 23:03
 */
public class L169多数元素 {
    public int majorityElement(int[] nums) {
        int res;
        HashMap<Integer, Integer> counts = new HashMap<>();
        for (int num : nums) {
            if (!counts.containsKey(num)) {
                counts.put(num, 1);
            } else {
                counts.put(num, counts.get(num) + 1);
            }
        }

        Map.Entry<Integer, Integer> integerEntry = null;

        for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
            if (integerEntry == null || entry.getValue() > integerEntry.getValue()) {
                integerEntry = entry;
            }
        }
        return integerEntry.getKey();
    }
}

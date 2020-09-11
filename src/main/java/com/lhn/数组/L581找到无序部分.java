package com.lhn.数组;

import java.util.Arrays;

/**
 * @author lhn
 * @date 2020/9/6 16:04
 */
public class L581找到无序部分 {

    public int findUnsortedSubarray(int[] nums) {
        int[] clone = nums.clone();
        Arrays.sort(clone);
        int a = 0;
        int b = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != clone[i]) {
                a = i;
                break;
            }
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] != clone[i]) {
                b = i;
                break;
            }
        }
        return b - a == 0 ? 0 : b - a + 1;
    }
}

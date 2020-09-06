package com.lhn;

import java.util.Arrays;

/**
 * @author lhn
 * @date 2020/8/23 13:22
 */
public class L283MoveZeroes {
    public static void main(String[] args) {
        int[] ints = {0, 1, 0, 3, 12};
        new L283MoveZeroes().moveZeroes(ints);
        System.out.println(Arrays.toString(ints));
    }

    public void moveZeroes(int[] nums) {
        int lastNonZeroFoundAt = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[lastNonZeroFoundAt++] = nums[i];
            }
        }
        for (int i = lastNonZeroFoundAt; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}

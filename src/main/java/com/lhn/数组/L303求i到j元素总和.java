package com.lhn.数组;

/**
 * @author lhn
 * @date 2020/9/10 23:08
 */
public class L303求i到j元素总和 {
    private final int[] sum;

    public L303求i到j元素总和(int[] nums) {
        sum = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            sum[i + 1] = sum[i] + nums[i];
        }
    }

    public int sumRange(int i, int j) {
        return sum[j+1] - sum[i];
    }
}

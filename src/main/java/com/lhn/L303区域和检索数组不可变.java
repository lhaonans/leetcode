package com.lhn;

/**
 * @author lhn
 * @date 2020/9/10 23:08
 */
public class L303区域和检索数组不可变 {
    private final int[] sum;

    public L303区域和检索数组不可变(int[] nums) {
        sum = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            sum[i + 1] = sum[i] + nums[i];
        }
    }

    public int sumRange(int i, int j) {
        return sum[j+1] - sum[i];
    }
}

package com.lhn.dp;

/**
 * @author lhn
 * @date 2020/9/10 23:01
 */
public class L152乘积最大子数组 {
    public int maxProduct(int[] nums) {
        int[] dpMin = new int[nums.length];
        int[] dpMax = new int[nums.length];
        int res;
        res = dpMax[0] = dpMin[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            dpMax[i] = Math.max(dpMax[i - 1] * nums[i], Math.max(dpMin[i - 1] * nums[i], nums[i]));
            dpMin[i] = Math.min(dpMax[i - 1] * nums[i], Math.min(dpMin[i - 1] * nums[i], nums[i]));
            res = Math.max(res, dpMax[i]);
        }
        return res;
    }
}

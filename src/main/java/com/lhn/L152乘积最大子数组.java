package com.lhn;

/**
 * @author lhn
 * @date 2020/9/10 23:01
 */
public class L152乘积最大子数组 {
    public int maxProduct(int[] nums) {
        int[] fMin = new int[nums.length];
        int[] fMax = new int[nums.length];
        int res;
        res = fMax[0] = fMin[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            fMax[i] = Math.max(fMax[i - 1] * nums[i], Math.max(fMin[i - 1] * nums[i], nums[i]));
            fMin[i] = Math.min(fMax[i - 1] * nums[i], Math.min(fMin[i - 1] * nums[i], nums[i]));
            res = Math.max(res, fMax[i]);
        }
        return res;
    }
}

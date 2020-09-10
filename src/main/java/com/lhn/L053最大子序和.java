package com.lhn;

/**
 * @author lhn
 * @date 2020/9/10 22:47
 */
public class L053最大子序和 {
    public int maxSubArray(int[] nums) {
        int res = nums[0];
        int pre = 0;
        for (int num : nums) {
            pre = Math.max(pre + num, num);
            res = Math.max(res, pre);
        }
        return res;
    }
}

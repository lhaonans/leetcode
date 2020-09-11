package com.lhn.dp;

/**
 * @author lhn
 * @date 2020/8/25 15:19
 */
public class L198打家劫舍   {
    // 不能偷相邻的家
    public int rob(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int[] dp = new int[nums.length + 1];
        dp[0] = 0;
        dp[1] = nums[0];

        for (int i = 2; i <= nums.length; i++) {
            dp[i] = Math.max(dp[i - 2] + nums[i - 1], dp[i - 1]);
        }
        return dp[nums.length];
    }
}

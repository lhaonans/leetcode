package com.lhn.dp;

import java.util.Arrays;

/**
 * @author lhn
 * @date 2020/8/25 15:41
 */
public class L213HouseRobberII {
    public static void main(String[] args) {
        System.out.println(new L213HouseRobberII().rob(new int[]{1}));
    }

    public int rob(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        return Math.max(
                robHelper(Arrays.copyOfRange(nums, 0, nums.length - 1)),
                robHelper(Arrays.copyOfRange(nums, 1, nums.length))
        );
    }

    public int robHelper(int[] nums) {
        int[] dp = new int[nums.length + 1];
        dp[0] = 0;
        dp[1] = nums[0];

        for (int i = 2; i <= nums.length; i++) {
            dp[i] = Math.max(dp[i - 2] + nums[i - 1], dp[i - 1]);
        }
        return dp[nums.length];
    }
}

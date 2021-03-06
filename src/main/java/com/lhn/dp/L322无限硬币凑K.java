package com.lhn.dp;

import java.util.Arrays;

/**
 * @author lhn
 * @date 2020/8/23 19:36
 */
public class L322无限硬币凑K {
    //每种硬币无限个,凑K,最少要几个
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);

        dp[0] = 0;
        for (int coin : coins) {
            for (int i = 1; i <= amount; i++) {
                if (i >= coin) {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }
        return dp[amount] == amount + 1 ? -1 : dp[amount];
    }
}

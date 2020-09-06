package com.lhn.dp;

/**
 * @author lhn
 * @date 2020/8/25 14:39
 */
public class L518CoinChangeII {
    public static void main(String[] args) {
        System.out.println(new L518CoinChangeII().change(5, new int[]{1, 2, 5}));
    }

    public int change(int amount, int[] coins) {
        int[][] dp = new int[coins.length + 1][amount + 1];

        for (int i = 0; i <= coins.length; i++) {
            dp[i][0] = 1;
        }

        for (int i = 1; i <= coins.length; i++) {
            for (int j = 1; j <= amount; j++) {
                if (j - coins[i - 1] >= 0) {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - coins[i - 1]];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[coins.length][amount];
    }
}

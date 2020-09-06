package com.lhn.dp;

/**
 * @author lhn
 * @date 2020/8/24 16:27
 */
public class L122BestTimeToBuyAndSellStockII {
    public static void main(String[] args) {
        System.out.println(new L122BestTimeToBuyAndSellStockII().maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }

    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[][] dp = new int[n + 1][2];
        dp[0][0] = 0;
        dp[0][1] = Integer.MIN_VALUE;
        for (int i = 1; i <= n; i++) {
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] + prices[i - 1]);
            dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][0] - prices[i - 1]);
        }
        return dp[n][0];
    }
}

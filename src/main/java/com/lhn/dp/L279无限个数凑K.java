package com.lhn.dp;

import java.util.Arrays;

/**
 * @author lhn
 * @date 2020/9/3 16:12
 */
public class L279无限个数凑K {
    // 每个数字无限个,凑K,最少需要几个数
    public int numSquares(int n) {
        int squareIndex = (int) Math.sqrt(n) + 1;
        int[] squareNums = new int[squareIndex];
        for (int i = 1; i < squareIndex; i++) {
            squareNums[i] = i * i;
        }

        int[] dp = new int[n + 1];
        Arrays.fill(dp, n + 1);

        dp[0] = 0;
        for (int squareNum : squareNums) {
            for (int i = 1; i <= n; i++) {
                if (i >= squareNum) {
                    dp[i] = Math.min(dp[i], dp[i - squareNum] + 1);
                }
            }
        }
        return dp[n] == n + 1 ? -1 : dp[n];
    }
}

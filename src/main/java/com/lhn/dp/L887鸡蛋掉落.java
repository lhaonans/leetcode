package com.lhn.dp;

import java.util.Arrays;

/**
 * @author lhn
 * @date 2020/8/24 20:15
 */
public class L887鸡蛋掉落 {

    public int superEggDrop(int K, int N) {

        int[][] dp = new int[N + 1][K + 1];

        for (int i = 0; i <= N; i++) {
            Arrays.fill(dp[i], Integer.MAX_VALUE);
        }

        for (int j = 0; j <= K; j++) {
            dp[0][j] = 0;
        }
        dp[1][0] = 0;
        for (int j = 1; j <= K; j++) {
            dp[1][j] = 1;
        }
        for (int i = 0; i <= N; i++) {
            dp[i][0] = 0;
            dp[i][1] = i;
        }


        for (int i = 2; i <= N; i++) {
            for (int j = 2; j <= K; j++) {
                int left = 1;
                int right = i;
                while (left < right) {
                    int mid = left + (right - left + 1) / 2;
                    int breakCount = dp[mid - 1][j - 1];
                    int notBreakCount = dp[i - mid][j];
                    if (breakCount > notBreakCount) {
                        right = mid - 1;
                    } else {
                        left = mid;
                    }
                }
                dp[i][j] = Math.max(dp[left - 1][j - 1], dp[i - left][j]) + 1;
            }
        }
        return dp[N][K];

    }
}

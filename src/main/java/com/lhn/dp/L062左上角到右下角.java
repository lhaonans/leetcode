package com.lhn.dp;

/**
 * @author lhn
 * @date 2020/9/10 22:49
 */
public class L062左上角到右下角 {
    //无障碍,从数组左上角到右下角有几种方法
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[n][m];

        for (int i = 0; i < n; i++) {
            dp[i][0] = 1;
        }
        for (int i = 0; i < m; i++) {
            dp[0][i] = 1;
        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        return dp[n - 1][m - 1];
    }
}

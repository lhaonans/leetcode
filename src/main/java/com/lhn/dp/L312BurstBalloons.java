package com.lhn.dp;

/**
 * @author lhn
 * @date 2020/8/23 14:07
 */
public class L312BurstBalloons {


    public static void main(String[] args) {
        System.out.println(new L312BurstBalloons().maxCoins(new int[]{3, 1, 5, 8}));
    }

    public int maxCoins(int[] nums) {
        int n = nums.length;
        int[] points = new int[n + 2];
        points[0] = points[n + 1] = 1;
        System.arraycopy(nums, 0, points, 1, n);

        int[][] dp = new int[n + 2][n + 2];

        // i 应该从下往上
        for (int i = n; i >= 0; i--) {
            // j 应该从左往右
            for (int j = i + 1; j < n + 2; j++) {
                // 最后戳破的气球是哪个？
                for (int k = i + 1; k < j; k++) {
                    // 择优做选择
                    dp[i][j] = Math.max(dp[i][j], dp[i][k] + dp[k][j] + points[i] * points[j] * points[k]
                    );
                }
            }
        }
        return dp[0][n + 1];
    }
}

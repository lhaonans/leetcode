package com.lhn.数学;

/**
 * @author lhn
 * @date 2020/9/11 22:39
 */
public class L264找第N个丑数 {
    public int nthUglyNumber(int n) {
        int i2 = 0, i3 = 0, i5 = 0;
        int[] dp = new int[n];
        dp[0] = 1;
        for (int i = 1; i < n; i++) {
            dp[i] = Math.min(Math.min(dp[i2] * 2, dp[i3] * 3), dp[i5] * 5);
            if (dp[i] == dp[i2] * 2) {
                i2++;
            }
            if (dp[i] == dp[i3] * 3) {
                i3++;
            }
            if (dp[i] == dp[i5] * 5) {
                i5++;
            }
        }
        return dp[n - 1];
    }
}

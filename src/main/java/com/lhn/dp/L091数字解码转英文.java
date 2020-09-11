package com.lhn.dp;

/**
 * @author lhn
 * @date 2020/9/10 22:53
 */
public class L091数字解码转英文 {
    public int numDecodings(String s) {

        if (s.length() == 0) {
            return 0;
        }
        if (s.charAt(0) == '0') {
            return 0;
        }

        int[] dp = new int[s.length() + 1];
        dp[0] = 1;
        dp[1] = s.charAt(0) == '0' ? 0 : dp[0];

        for (int i = 1; i < s.length(); i++) {
            dp[i + 1] = s.charAt(i) == '0' ? 0 : dp[i];
            if (s.charAt(i - 1) == '1' || (s.charAt(i - 1) == '2' && s.charAt(i) <= '6')) {
                dp[i + 1] += dp[i - 1];
            }
        }

        return dp[s.length()];
    }
}

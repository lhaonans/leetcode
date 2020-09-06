package com.lhn.dp;

/**
 * @author lhn
 * @date 2020/8/23 14:56
 */
public class L509FibonacciNumber {
    public static void main(String[] args) {
        System.out.println(fib(60));
    }

    public static int fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int[] dp = new int[n + 1];
        dp[1] = dp[2] = 1;
        for (int i = 3; i < dp.length; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
}

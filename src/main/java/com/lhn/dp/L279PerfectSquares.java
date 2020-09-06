package com.lhn.dp;

import java.util.Arrays;

/**
 * @author lhn
 * @date 2020/9/3 16:12
 */
public class L279PerfectSquares {
    public static void main(String[] args) {
        System.out.println(new L279PerfectSquares().numSquares(13));
    }

    public int numSquares(int n) {
        int squareIndex = (int) Math.sqrt(n) + 1;
        int[] squareNums = new int[squareIndex];
        for (int i = 1; i < squareIndex; i++) {
            squareNums[i] = i * i;
        }
        System.out.println(Arrays.toString(squareNums));
        System.out.println(n);
        return new L322CoinChange().coinChange(squareNums,n);
    }
}

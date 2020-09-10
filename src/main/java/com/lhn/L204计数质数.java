package com.lhn;

import java.util.Arrays;

/**
 * @author lhn
 * @date 2020/8/26 14:08
 */
public class L204计数质数 {

    public int countPrimes(int n) {
        boolean[] isPrimes = new boolean[n];
        Arrays.fill(isPrimes, true);

        for (int i = 2; i * i < n; i++) {
            if (isPrimes[i]) {
                for (int j = i * i; j < n; j = j + i) {
                    isPrimes[j] = false;
                }
            }
        }
        int res = 0;
        for (int i = 2; i < isPrimes.length; i++) {
            if (isPrimes[i]) {
                res++;
            }
        }
        return res;
    }

}

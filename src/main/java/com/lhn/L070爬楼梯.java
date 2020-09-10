package com.lhn;

/**
 * @author lhn
 * @date 2020/9/10 22:51
 */
public class L070爬楼梯 {
    public int climbStairs(int n) {
        int x = 0;
        int y = 0;
        int z = 1;
        for (int i = 0; i < n; i++) {
            x = y;
            y = z;
            z = x + y;
        }
        return z;
    }
}

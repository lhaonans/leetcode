package com.lhn.数学;

/**
 * @author lhn
 * @date 2020/9/10 22:50
 */
public class L069X的平方根 {
    public int mySqrt(int x) {
        int left = 0, right = x, mid, res = -1;
        while (left <= right) {
            mid = (right - left) / 2 + left;
            if ((long)mid * mid <= x) {
                res = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return res;
    }
}

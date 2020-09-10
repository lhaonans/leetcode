package com.lhn;

/**
 * @author lhn
 * @date 2020/9/10 23:05
 */
public class L278第一个错误的版本 {
    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        int mid;

        while (left < right) {
            mid = left + (right - left) / 2;
            if (isBadVersion(mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    private boolean isBadVersion(int mid) {
        return true;
    }
}

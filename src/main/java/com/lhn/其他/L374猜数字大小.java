package com.lhn.其他;

/**
 * @author lhn
 * @date 2020/9/10 23:11
 */
public class L374猜数字大小 {
    public int guessNumber(int n) {
        int left = 1, right = n, mid;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (guess(mid) == -1) {
                right = mid - 1;
            } else if (guess(mid) == 1) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    private int guess(int mid) {
        return 0;
    }
}

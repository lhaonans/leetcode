package com.lhn;

/**
 * @author lhn
 * @date 2020/9/10 23:03
 */
public class L162寻找峰值 {
    public int findPeakElement(int[] nums) {
        int left = 0, right = nums.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[mid + 1]) {
                right  = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}

package com.lhn.其他;

/**
 * @author lhn
 * @date 2020/9/10 23:16
 */
public class L704二分查找 {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int mid = (nums.length - 1) / 2;
        while (left <= right) {
            mid = (right - left) / 2 + left;
            if (target > nums[mid]) {
                left = mid + 1;
            } else if (target < nums[mid]) {
                right = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}

package com.lhn;

/**
 * @author lhn
 * @date 2020/9/10 22:32
 */
public class L004两个正序数组的中位数 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;

        int[] nums = new int[m + n];
        int p1 = 0, p2 = 0, p = 0;

        while (p1 < m && p2 < n) {
            if (nums1[p1] < nums2[p2]) {
                nums[p] = nums1[p1];
                p++;
                p1++;
            } else {
                nums[p] = nums2[p2];
                p++;
                p2++;
            }
        }

        if (p1 < m) {
            System.arraycopy(nums1, p1, nums, p1 + p2, m - p1);
        }
        if (p2 < n) {
            System.arraycopy(nums2, p2, nums, p1 + p2, n - p2);
        }
        int length = nums.length;
        if (length % 2 == 1) {
            return nums[length / 2];
        } else {
            return (nums[length / 2 - 1] + nums[length / 2]) / 2.0;
        }
    }
}

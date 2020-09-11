package com.lhn.数组;

/**
 * @author lhn
 * @date 2020/9/10 22:53
 */
public class L080合并两个有序数组 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums1Copy = new int[m];
        System.arraycopy(nums1, 0, nums1Copy, 0, m);

        int p1 = 0, p2 = 0, p = 0;

        while (p1 < m && p2 < n) {
            if (nums1Copy[p1] < nums2[p2]) {
                nums1[p] = nums1Copy[p1];
                p++;
                p1++;
            } else {
                nums1[p] = nums2[p2];
                p++;
                p2++;
            }
        }
        if (p1 < m) {
            System.arraycopy(nums1Copy, p1, nums1, p1 + p2, m + n - p1 - p2);
        }
        if (p2 < n) {
            System.arraycopy(nums2, p2, nums1, p1 + p2, m + n - p1 - p2);
        }
    }
}

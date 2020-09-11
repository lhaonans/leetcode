package com.lhn.数组;

/**
 * @author lhn
 * @date 2020/9/10 22:44
 */
public class L034在排序数组中查找元素的第一个和最后一个位置 {
    public int[] searchRange(int[] nums, int target) {
        int[] res = {-1, -1};
        res[0] = searchLeftRange(nums, target);
        res[1] = searchRightRange(nums, target);
        return res;
    }

    public int searchLeftRange(int[] nums, int target) {
        int left = 0;
        int right = nums.length;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (target == nums[mid]) {
                right = mid;
            } else if (target < nums[mid]) {
                right = mid;
            } else if (target > nums[mid]) {
                left = mid + 1;
            }
        }

        if (left == nums.length) {
            return -1;
        }
        if (nums[left] == target) {
            return left;
        } else {
            return -1;
        }
    }

    public int searchRightRange(int[] nums, int target) {
        int left = 0;
        int right = nums.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (target == nums[mid]) {
                left = mid + 1;
            } else if (target < nums[mid]) {
                right = mid;
            } else if (target > nums[mid]) {
                left = mid + 1;
            }
        }

        if (left == 0) {
            return -1;
        }
        if (nums[left - 1] == target) {
            return left - 1;
        } else {
            return -1;
        }
    }
}

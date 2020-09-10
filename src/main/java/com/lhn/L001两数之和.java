package com.lhn;

/**
 * @author lhn
 * @date 2020/8/23 10:47
 */
public class L001两数之和 {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (temp == nums[j]) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
}

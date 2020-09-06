package com.lhn;

import java.util.Arrays;

/**
 * @author lhn
 * @date 2020/8/23 10:47
 */
public class L001TwoSum {
    public static void main(String[] args) {
        int[] ints = {2, 7, 11, 15};
        L001TwoSum l001TwoSum = new L001TwoSum();
        System.out.println(Arrays.toString(l001TwoSum.twoSum(ints, 9)));
    }

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

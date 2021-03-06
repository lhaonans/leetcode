package com.lhn.数组;

/**
 * @author lhn
 * @date 2020/9/5 22:56
 */
public class L560和为K的子数组 {


    public int subarraySum(int[] nums, int k) {
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j >= 0; j--) {
                sum += nums[j];
                if (sum == k) {
                    res++;
                }
            }
        }
        return res;
    }
}

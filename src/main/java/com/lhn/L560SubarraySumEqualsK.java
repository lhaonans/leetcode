package com.lhn;

/**
 * @author lhn
 * @date 2020/9/5 22:56
 */
public class L560SubarraySumEqualsK {
    public static void main(String[] args) {
        System.out.println(new L560SubarraySumEqualsK().subarraySum(new int[]{1, 1, 1}, 2));
    }

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

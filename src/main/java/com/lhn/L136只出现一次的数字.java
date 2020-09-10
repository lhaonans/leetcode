package com.lhn;

/**
 * @author lhn
 * @date 2020/9/10 22:59
 */
public class L136只出现一次的数字 {
    public int singleNumber(int[] nums) {
        int res = 0;
        for (int num : nums) {
            res ^= num;
        }
        return res;
    }
}

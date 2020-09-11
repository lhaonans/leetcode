package com.lhn.数组;

/**
 * @author lhn
 * @date 2020/9/10 22:59
 */
public class L136只出现一次的数字 {
    //其他数字都出现两次
    public int singleNumber(int[] nums) {
        int res = 0;
        for (int num : nums) {
            res ^= num;
        }
        return res;
    }
}

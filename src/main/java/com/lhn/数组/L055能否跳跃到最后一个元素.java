package com.lhn.数组;

/**
 * @author lhn
 * @date 2020/9/10 22:48
 */
public class L055能否跳跃到最后一个元素 {
    public boolean canJump(int[] nums) {
        int length = nums.length;
        int most = 0;
        for (int i = 0; i < length; i++) {
            if (i <= most) {
                most = Math.max(most, i + nums[i]);
                if (most >= length - 1) {
                    return true;
                }
            }
        }
        return false;
    }
}

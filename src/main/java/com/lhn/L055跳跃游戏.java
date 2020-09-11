package com.lhn;

/**
 * @author lhn
 * @date 2020/9/10 22:48
 */
public class L055跳跃游戏 {
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

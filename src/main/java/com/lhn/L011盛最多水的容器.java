package com.lhn;

/**
 * @author lhn
 * @date 2020/9/10 22:36
 */
public class L011盛最多水的容器 {
    public int maxArea(int[] height) {
        int square = 0, left = 0, right = height.length - 1;
        while (left < right) {
            square = Math.max(square, Math.min(height[left], height[right]) * (right - left));
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return square;
    }
}

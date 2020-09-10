package com.lhn;

/**
 * @author lhn
 * @date 2020/9/10 22:52
 */
public class L075颜色分类 {
    public void sortColors(int[] nums) {
        int p0 = 0, current = 0, p2 = nums.length - 1;
        int temp = 0;
        while (p2 >= current) {
            if (nums[current] == 0) {
                temp = nums[p0];
                nums[p0] = nums[current];
                nums[current] = temp;
                p0++;
                current++;
            } else if (nums[current] == 2) {
                temp = nums[p2];
                nums[p2] = nums[current];
                nums[current] = temp;
                p2--;
            } else {
                current++;
            }
        }
    }
}

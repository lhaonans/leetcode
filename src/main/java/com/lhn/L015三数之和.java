package com.lhn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * @author lhn
 * @date 2020/9/10 22:38
 */
public class L015三数之和 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int left = i + 1, right = nums.length - 1;

            while (left < right) {
                int result = nums[i] + nums[left] + nums[right];
                if (result == 0) {
                    res.add(new ArrayList<Integer>(Arrays.asList(nums[i], nums[left], nums[right])));
                    right--;
                    left++;
                } else if (result > 0) {
                    right--;
                } else {
                    left++;
                }
            }
        }
        HashSet<List<Integer>> objects = new HashSet<>(res);
        res.clear();
        res.addAll(objects);
        return res;
    }
}

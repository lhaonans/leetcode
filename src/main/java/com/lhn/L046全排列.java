package com.lhn;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author lhn
 * @date 2020/8/23 20:03
 */
public class L046全排列 {

    public List<List<Integer>> permute(int[] nums) {
        LinkedList<Integer> track = new LinkedList<>();
        List<List<Integer>> res = new LinkedList<>();
        backtrack(nums, track, res);
        return res;
    }

    void backtrack(int[] nums, LinkedList<Integer> track, List<List<Integer>> res) {

        if (track.size() == nums.length) {
            res.add(new ArrayList<>(track));
            return;
        }

        for (int num : nums) {
            if (track.contains(num)) {
                continue;
            }
            track.add(num);
            backtrack(nums, track, res);
            track.removeLast();
        }
    }
}

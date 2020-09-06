package com.lhn.backtrack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author lhn
 * @date 2020/8/23 20:03
 */
public class L046Permutations {
    public static void main(String[] args) {
        List<List<Integer>> permute = new L046Permutations().permute(new int[]{1, 2, 3});
        System.out.println(Arrays.toString(permute.toArray()));

    }

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

package com.lhn;

import java.util.*;

/**
 * @author lhn
 * @date 2020/8/28 20:40
 */
public class L448FindAllNumbersDisappearedInAnArray {
    public static void main(String[] args) {
        List<Integer> list = new L448FindAllNumbersDisappearedInAnArray().findDisappearedNumbers(new int[]{4, 3, 2, 7, 8, 2, 3, 1});
        System.out.println(list.toString());
    }

    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> res = new ArrayList<>();

        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        for (int i = 1; i <= nums.length; i++) {
            if (!set.contains(i)) {
                res.add(i);
            }
        }
        return res;
    }
}

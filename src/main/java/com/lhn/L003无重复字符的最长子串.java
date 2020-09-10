package com.lhn;

import java.util.HashSet;

/**
 * @author lhn
 * @date 2020/9/10 22:30
 */
public class L003无重复字符的最长子串 {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> characters = new HashSet<>();
        int length = s.length();
        int rk = -1, ans = 0;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                characters.remove(s.charAt(i - 1));
            }
            while (rk + 1 < length && characters.add(s.charAt(rk + 1))) {
                rk++;
            }
            ans = Math.max(ans, rk - i + 1);
        }
        return ans;
    }
}

package com.lhn;

/**
 * @author lhn
 * @date 2020/9/10 22:33
 */
public class L005最长回文子串 {
    public String longestPalindrome(String s) {
        if (s.length() < 2) {
            return s;
        }
        int beginIndex = 0;
        int max = 0;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length - 1; i++) {
            for (int j = i + 1; j < chars.length; j++) {
                if (j - i > max && valid(chars, i, j)) {
                    beginIndex = i;
                    max = j - i;
                }
            }
        }
        return s.substring(beginIndex, max + beginIndex + 1);
    }

    public boolean valid(char[] chars, int left, int right) {
        while (left < right) {
            if (chars[left] == chars[right]) {
                left++;
                right--;
            } else {
                return false;
            }
        }
        return true;
    }
}

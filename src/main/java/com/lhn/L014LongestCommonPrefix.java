package com.lhn;

/**
 * @author lhn
 * @date 2020/9/5 23:42
 */
public class L014LongestCommonPrefix {
    public static void main(String[] args) {
        new L014LongestCommonPrefix().longestCommonPrefix(new String[]{"flower", "flow", "flight"});
    }

    public String longestCommonPrefix(String[] strs) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < strs[0].length(); i++) {
            char temp = strs[0].charAt(i);
            for (String str : strs) {
                try {
                    if (temp != str.charAt(i)) {
                        break;
                    }
                } catch (Exception e) {
                    return stringBuilder.toString();
                }
                stringBuilder.append(temp);
            }
        }
        return stringBuilder.toString();
    }
}

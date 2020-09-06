package com.lhn.backtrack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author lhn
 * @date 2020/8/28 16:42
 */
public class L022GenerateParentheses {
    public static void main(String[] args) {
        List<String> strings = new L022GenerateParentheses().generateParenthesis(3);
        System.out.println(Arrays.toString(strings.toArray()));
    }

    public List<String> generateParenthesis(int n) {
        ArrayList<String> arrayList = new ArrayList<>();
        StringBuilder track = new StringBuilder();
        backtrack(track, 0, 0, n, arrayList);
        return arrayList;
    }

    private void backtrack(StringBuilder track, int left, int right, int n, List<String> res) {
        if (left == n && right == n) {
            res.add(track.toString());
            return;
        }

        if (n > left) {
            track.append("(");
            backtrack(track, left + 1, right, n, res);
            track.deleteCharAt(track.length() - 1);
        }

        if (left > right) {
            track.append(")");
            backtrack(track, left, right + 1, n, res);
            track.deleteCharAt(track.length() - 1);
        }
    }
}

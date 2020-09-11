package com.lhn.二叉树;

import com.lhn.global.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lhn
 * @date 2020/9/10 23:00
 */
public class L144前序遍历 {
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> integers = new ArrayList<>();
        preorderTraversal(root, integers);
        return integers;

    }

    public List<Integer> preorderTraversal(TreeNode root, List<Integer> list) {
        if (root == null) {
            return null;
        }
        list.add(root.val);
        preorderTraversal(root.left, list);
        preorderTraversal(root.right, list);
        return list;
    }
}

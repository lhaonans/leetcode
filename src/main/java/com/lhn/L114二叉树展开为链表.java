package com.lhn;

import com.lhn.global.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lhn
 * @date 2020/9/10 22:58
 */
public class L114二叉树展开为链表 {
    public void flatten(TreeNode root) {
        ArrayList<TreeNode> list = new ArrayList<>();
        preorderTraversal(root, list);
        for (int i = 0; i < list.size() - 1; i++) {
            list.get(i).left = null;
            list.get(i).right = list.get(i + 1);
        }

    }

    public void preorderTraversal(TreeNode root, List<TreeNode> list) {
        if (root != null) {
            list.add(root);
            preorderTraversal(root.left, list);
            preorderTraversal(root.right, list);
        }
    }
}

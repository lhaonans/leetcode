package com.lhn;

import com.lhn.global.TreeNode;

import java.util.*;

/**
 * @author lhn
 * @date 2020/8/25 15:54
 */
public class L337打家劫舍III {

    Map<TreeNode, Integer> f;
    Map<TreeNode, Integer> g;

    public int rob(TreeNode root) {
        this.f = new HashMap<>();
        this.g = new HashMap<>();
        dfs(root);
        return Math.max(f.getOrDefault(root, 0), g.getOrDefault(root, 0));
    }

    public void dfs(TreeNode node) {
        if (node == null) {
            return;
        }
        dfs(node.left);
        dfs(node.right);

        f.put(node, node.val + g.getOrDefault(node.left, 0) + g.getOrDefault(node.right, 0));
        g.put(node, Math.max(f.getOrDefault(node.left, 0), g.getOrDefault(node.left, 0)) +
                Math.max(f.getOrDefault(node.right, 0), g.getOrDefault(node.right, 0))
        );
    }
}

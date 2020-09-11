package com.lhn.二叉树;

import com.lhn.global.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author lhn
 * @date 2020/8/24 13:30
 */
public class L111最小深度  {
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        int depth = 1;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode poll = queue.poll();
                if (poll.left == null && poll.right == null) {
                    return depth;
                }
                if (poll.left != null) {
                    queue.offer(poll.left);
                }
                if (poll.right != null) {
                    queue.offer(poll.right);
                }
            }
            depth++;

        }
        return depth;
    }
}

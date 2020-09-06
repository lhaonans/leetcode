package com.lhn.bfs;

import com.lhn.global.TreeNode;

import java.util.*;

/**
 * @author lhn
 * @date 2020/8/23 10:59
 */
public class L102BinaryTreeLevelOrderTraversal {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        List<List<Integer>> lists = new L102BinaryTreeLevelOrderTraversal().levelOrder(root);
        System.out.println(Arrays.toString(lists.toArray()));
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        ArrayList<List<Integer>> res = new ArrayList<>();

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int count = queue.size();
            List<Integer> list = new ArrayList<>();

            while (count > 0) {
                TreeNode poll = queue.poll();
                list.add(poll.val);

                if (poll.left != null) {
                    queue.offer(poll.left);
                }
                if (poll.right != null) {
                    queue.offer(poll.right);
                }
                count--;
            }
            res.add(list);
        }
        return res;
    }
}

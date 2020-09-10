package com.lhn;

import com.lhn.global.TreeNode;

/**
 * @author lhn
 * @date 2020/9/10 22:58
 */
public class L105从前序与中序遍历序列构造二叉树 {

    private int pre = 0, in = 0;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return buildTree(preorder, inorder, Integer.MAX_VALUE);
    }

    public TreeNode buildTree(int[] preorder, int[] inorder, int stop) {
        if (pre >= preorder.length) {
            return null;
        }

        if (inorder[in] == stop) {
            in++;
            return null;
        }

        int current = preorder[pre++];
        TreeNode treeNode = new TreeNode(current);
        treeNode.left = buildTree(preorder, inorder, current);
        treeNode.right = buildTree(preorder, inorder, stop);

        return treeNode;
    }
}

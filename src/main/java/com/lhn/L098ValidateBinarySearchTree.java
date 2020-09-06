package com.lhn;

import com.lhn.global.TreeNode;

/**
 * @author lhn
 * @date 2020/8/28 20:02
 */
public class L098ValidateBinarySearchTree {
    public static void main(String[] args) {

    }
    long pre = Long.MIN_VALUE;

    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }

        if (isValidBST(root)) {
            return false;
        }

        if (root.val <= pre) {
            return false;
        }
        pre = root.val;

        return isValidBST(root.right);
    }
}

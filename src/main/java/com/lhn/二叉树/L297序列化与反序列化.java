package com.lhn.二叉树;

import com.lhn.global.TreeNode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author lhn
 * @date 2020/9/10 23:07
 */
public class L297序列化与反序列化 {
    public String serialize(TreeNode root, String str) {
        if (root == null) {
            str += "None,";
        } else {
            str += root.val + ",";
            str = serialize(root.left, str);
            str = serialize(root.right, str);
        }
        return str;
    }

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        return serialize(root, "");
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] split = data.split(",");
        LinkedList<String> strings = new LinkedList<>(Arrays.asList(split));
        return deserialize(strings);
    }

    public TreeNode deserialize(List<String> list) {
        if (list.get(0).equals("None")) {
            list.remove(0);
            return null;
        }

        TreeNode treeNode = new TreeNode(Integer.parseInt(list.get(0)));
        list.remove(0);
        treeNode.left = deserialize(list);
        treeNode.right = deserialize(list);
        return treeNode;
    }
}

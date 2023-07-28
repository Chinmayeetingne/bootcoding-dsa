package com.bootcoding.dsa.tree;

public class EvenNoOfTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);

        root.left = n2;
        root.right = n3;
        n2.left = n4;
        n2.right = n5;

        evenNode(root);

    }

    public static void evenNode(TreeNode root) {
        if (root != null) {
            evenNode(root.left);
            if (root.data % 2 == 0) {
                System.out.println(root.data + " ");
                evenNode(root.right);
            }

        }
    }
}


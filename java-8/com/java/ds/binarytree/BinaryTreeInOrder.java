package com.java.ds.binarytree;

import java.util.Stack;

public class BinaryTreeInOrder {
    private TreeNode root;

    private class TreeNode{
        private int data;
        private TreeNode left;
        private TreeNode right;

        TreeNode(int data){
            this.data = data;
        }
    }

    public void createTree(){
        TreeNode first = new TreeNode(9);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode fourth = new TreeNode(7);
        TreeNode fifth = new TreeNode(4);

        root = first;
        first.left = second;
        first.right = third;
        second.left = fourth;
        fourth.left = fifth;
    }

    public static void main(String[] args) {

        BinaryTreeInOrder bti = new BinaryTreeInOrder();
        bti.createTree();
        bti.inOrder();
    }

    public void inOrder(){
        if (root == null){
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode temp = root;
        while (!stack.isEmpty() || temp != null){
            if (temp != null){
                stack.push(temp);
                temp = temp.left;
            }else {

                temp = stack.pop();
                System.out.print(temp.data + " ");
                temp = temp.right;

            }
        }
    }
}

package com.java.ds.binarytree;

import java.util.Stack;

public class BinaryTree {
    private TreeNodes root;

    private class TreeNodes{
        private int data;
        private TreeNodes left;
        private TreeNodes right;
        TreeNodes(int data){
            this.data = data;
        }
    }
    public void BuildTree(){
        TreeNodes first  = new TreeNodes(1);
        TreeNodes second  = new TreeNodes(2);
        TreeNodes third  = new TreeNodes(3);
        TreeNodes fouth  = new TreeNodes(4);
        TreeNodes fifth  = new TreeNodes(5);
        TreeNodes sixth  = new TreeNodes(6);
        TreeNodes seventh  = new TreeNodes(7);
        TreeNodes eightth  = new TreeNodes(8);

        root = first;
        first.left = second;
        first.right = third;
        second.left = fouth;
        second.right = fifth;
        third.left = sixth;
        third.right = seventh;
        //fouth.left = eightth;
    }

    public static void main(String[] args) {

        BinaryTree bt = new BinaryTree();
        bt.BuildTree();
        bt.preOrder();
    }

    public void preOrder(){
        if(root == null)
            return;
        Stack<TreeNodes> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()){
            TreeNodes temp = stack.pop();
            System.out.print(temp.data + " ");
            if (temp.right !=null){
                stack.push(temp.right);
            }
            if (temp.left != null){
                stack.push(temp.left);
            }
        }
    }
}

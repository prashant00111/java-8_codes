package com.java.ds.binarytree;

public class InOrderBinaryTree {
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
        TreeNode fourth = new TreeNode(4);
        //TreeNode fifth = new TreeNode(7);

        root = first;
        first.left = second;
        first.right = third;
        second.left = fourth;
        //fourth.left = fifth;
    }

    public static void main(String[] args) {
        InOrderBinaryTree ibt = new InOrderBinaryTree();
        ibt.createTree();
        ibt.inOrder(ibt.root);
    }

    public void inOrder(TreeNode root){
        if(root == null)
            return;
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }
}

package com.java.ds.binarytree;

public class TreeNodeBinaryTree {

    private Nodes root;

    private class Nodes{
        private Nodes left;
        private Nodes right;
        private int data;

        Nodes(int data){
            this.data = data;
        }
    }

    public void createBinary(){
        Nodes first = new Nodes(1);
        Nodes second = new Nodes(2);
        Nodes third = new Nodes(3);
        Nodes fourth = new Nodes(4);
        Nodes fifth = new Nodes(5);
        Nodes sixth = new Nodes(6);
        Nodes seventh = new Nodes(7);
        Nodes eightth = new Nodes(8);
        root = first;
        first.left = second;
        first.right = third;
        second.left = fourth;
        second.right = fifth;
        third.left = sixth;
        third.right = seventh;
    }
    public static void main(String[] args) {

        TreeNodeBinaryTree tn = new TreeNodeBinaryTree();
        tn.createBinary();
        tn.preOrder(tn.root);
    }

    public void preOrder(Nodes root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
}

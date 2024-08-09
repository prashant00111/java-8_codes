package com.java.ds.linkedList;

public class InsertNewNode {
    private ListNode head;

    private static class ListNode{
        private int data;
        private ListNode next;

        ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        InsertNewNode inn = new InsertNewNode();
        inn.insertFirst(11);
        inn.insertFirst(8);
        inn.insertFirst(1);
        inn.insertFirst(10);
        inn.print();
    }

    public void insertFirst(int value){
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
    }
    public void print(){
        ListNode current = head;
        while (current != null){
            System.out.print(current.data + " ---> ");
            current = current.next;
        }
        System.out.println("null");
    }
}

package com.java.ds.linkedList;

public class InsertNode {

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
        InsertNode in = new InsertNode();
        in.head = new ListNode(6);
        ListNode second = new ListNode(8);
        ListNode third = new ListNode(13);
        ListNode fourth = new ListNode(19);
        in.head.next = second;
        second.next = third;
        third.next = fourth;
        in.display();
        in.insertNewNode(15);
        in.display();
    }

    public void display(){
        ListNode current = head;
        while (current != null){
            System.out.print(current.data + " ---> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public ListNode insertNewNode(int value){
        ListNode newNode = new ListNode(value);
        if (head == null){
            return newNode;
        }
        ListNode current = head;
        ListNode temp = null;
        while (current != null && current.data < newNode.data){
            temp = current;
            current = current.next;
        }
        newNode.next = current;
        temp.next = newNode;
        return head;
    }
}

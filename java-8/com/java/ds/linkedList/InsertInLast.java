package com.java.ds.linkedList;

public class InsertInLast {
    private ListNode head;

    private static class ListNode{
        private int data;
        private ListNode next;

        ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }
    public void insertInLastNode(int value){
        ListNode newNode = new ListNode(value);
        if(head == null){
            head = newNode;
            return;
        }
        ListNode current = head;
        while (null != current.next){
            current = current.next;
        }
        current.next = newNode;

    }

    public static void main(String[] args) {
        InsertInLast iil = new InsertInLast();
        iil.insertInLastNode(11);
        iil.insertInLastNode(8);
        iil.display();

    }

    public void display(){
        InsertInLast.ListNode current = head;
        while (current != null){
            System.out.print(current.data + " ---> ");
            current = current.next;
        }
        System.out.println("null");
    }

}

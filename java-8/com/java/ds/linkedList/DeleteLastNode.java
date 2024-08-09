package com.java.ds.linkedList;

public class DeleteLastNode {
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
        DeleteLastNode dln = new DeleteLastNode();
        dln.head = new ListNode(12);
        ListNode second = new ListNode(13);
        ListNode third = new ListNode(5);
        ListNode fourth = new ListNode(8);
        ListNode fifth = new ListNode(1);
        dln.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        dln.display();
        System.out.println(dln.deleteNode().data);
        System.out.println(dln.deleteNode().data);
        System.out.println(dln.deleteNode().data);

        dln.display();
    }
    public void display(){
        ListNode current = head;
        while (current != null){
            System.out.print(current.data + " ---> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public ListNode deleteNode(){
        if(head == null || head.next == null){
            return head;
        }
        ListNode current = head;
        ListNode previous = null;
        while (current.next != null){
            previous = current;
            current = current.next;
        }
        previous.next = null;
        return current;

    }
}

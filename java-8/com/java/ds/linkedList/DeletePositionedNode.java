package com.java.ds.linkedList;

import com.java.intervew.stream.ListDemo;

public class DeletePositionedNode {
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
        DeletePositionedNode dpn = new DeletePositionedNode();
        dpn.head = new ListNode(11);
        ListNode second = new ListNode(8);
        ListNode third = new ListNode(1);
        ListNode fourth = new ListNode(10);
        ListNode fifth = new ListNode(3);

        dpn.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        dpn.display();
        dpn.deleteNode(3);
        dpn.display();
    }

    public void display(){
        ListNode current = head;
        while (current != null){
            System.out.print(current.data + " ---> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public void deleteNode(int position){
        if(position == 1){
            head = head.next;
        }else {
            ListNode previous = head;
            int count = 1;
            while (count < position -1){
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            previous.next = current.next;
        }
    }
}

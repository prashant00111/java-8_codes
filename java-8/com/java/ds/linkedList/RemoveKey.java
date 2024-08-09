package com.java.ds.linkedList;

public class RemoveKey {
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
        RemoveKey rk = new RemoveKey();
        rk.head = new ListNode(10);
        ListNode second = new ListNode(3);
        ListNode third = new ListNode(8);
        ListNode fourth = new ListNode(1);
        ListNode fifth = new ListNode(11);

        rk.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        rk.display();
        rk.removeValue(8);
        rk.display();
    }

    public void display(){
        ListNode current = head;
        while (current != null){
            System.out.print(current.data + " ---> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public void removeValue(int key){
        ListNode current  =head;
        ListNode temp = null;
        if(current != null && current.data == key){
            head = current.next;
            return;
        }
        while (current != null && current.data != key ){
            temp = current;
            current = current.next;
        }
        if(current == null)
            return;
        temp.next = current.next;

    }

}

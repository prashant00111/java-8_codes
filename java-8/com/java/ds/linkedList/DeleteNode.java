package com.java.ds.linkedList;

public class DeleteNode {
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
        DeleteNode dn = new DeleteNode();
        dn.head = new ListNode(10);
        ListNode second = new ListNode(8);
        ListNode third = new ListNode(1);
        ListNode fourth = new ListNode(11);

        dn.head.next = second;
        second.next = third;
        third.next = fourth;
        dn.display();
        System.out.println(dn.deleteFirst().data);
        dn.display();

    }

    public void display(){
        ListNode current = head;
        while (current != null){
            System.out.print(current.data + " ---> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public ListNode deleteFirst(){
        if (head == null){
            return null;
        }
        ListNode temp = head;
        head = head.next;
        temp.next = null;
        return temp;
    }
}

package com.java.ds.linkedList;

public class InsertInMidle {
    private ListNode head;

    private static class ListNode{
        private int data;
        private ListNode next;

        ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void display(){
        InsertInMidle.ListNode current = head;
        while (current != null){
            System.out.print(current.data + " ---> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public void insertInGivenPosition(int position, int value){
        ListNode node = new ListNode(value);
        if(position == 1){
            node.next = head;
            head = node;
        }else {
            ListNode previous = head;
            int count = 1;
            while (count < position - 1){
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            node.next = current;
            previous.next = node;
        }
    }

    public static void main(String[] args) {

        InsertInMidle iim = new InsertInMidle();
        iim.insertInGivenPosition(1,5);
        iim.insertInGivenPosition(2,8);
        iim.insertInGivenPosition(3,11);
        iim.insertInGivenPosition(2,10);

        iim.display();
    }
}

package com.bootcoding.dsa.linkedlist;

public class LinkedListEx1 {

    public static void main(String[] args) {
        Node head = createLinkedList();
        printLinkedList(head);
        insertNodeAtFirst(head);
        printLinkedList(insertNodeAtFirst(head));
        insertNodeByLast(head);
        printLinkedList(insertNodeByLast(head));
        lengthOfLinkedList(head);
    }
    //creating linkedlist
    public static Node createLinkedList() {
        //creation of linked list
        Node firstNode = new Node(10);
        Node secondNode = new Node(20);
        Node thirdNode = new Node(30);
        Node fourthNode = new Node(40);

        //linking of list
        Node head = firstNode;
        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = fourthNode;
        fourthNode.next = null;
        return firstNode;
    }

    //insert node at first position
    public static Node insertNodeAtFirst(Node head) {
        Node newNode = new Node(10);
        newNode.next = head;
        head = newNode;
        return head;
    }

    //insert node at last position
    public static Node insertNodeByLast(Node head) {
        Node temp = head;
        while (temp != null) {
            if (temp.next == null) {
                Node newNode = new Node(60);
                temp.next = newNode;
                return head;
            }
            temp = temp.next;
        }
        return head;
    }


    //print the linked list
    public static void printLinkedList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -->");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void lengthOfLinkedList(Node head){
        Node temp = head;
        int count = 0;
        while(temp != null){
            temp=temp.next;
            count++;
        }
        System.out.println(count);
    }
}

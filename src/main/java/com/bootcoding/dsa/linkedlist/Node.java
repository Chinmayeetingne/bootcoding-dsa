package com.bootcoding.dsa.linkedlist;

import java.util.LinkedList;


public class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
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
        head.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = fourthNode;
        fourthNode.next = null;
        return head;
    }

    public static Node insertNodeAtFirst(Node head) {
        Node newNode = new Node(10);
        newNode.next = head;
        head = newNode;
        return head;
    }

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
    public static void main(String[] args) {
        Node head = createLinkedList();
        printLinkedList(head);
        insertNodeAtFirst(head);
        printLinkedList(insertNodeAtFirst(head));
        insertNodeByLast(head);
        printLinkedList(insertNodeByLast(head));
        lengthOfLinkedList(head);

    }
}
package com.bootcoding.dsa.linkedlist;

import java.util.LinkedList;


public class Node {
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        this.next=null;
    }
    //creating linkedlist
    public static Node createLinkedList(){
        Node firstNode = new Node(10);
        Node secondNode = new Node(20);
        Node thirdNode = new Node(30);
        Node fourthNode = new Node(40);

        Node head = firstNode;
        head.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = fourthNode;
        fourthNode.next = null;
        return head;
    }
   //printing linkedlist
    public static void printLinkedList(Node head)
    {
        Node temp = head;
        while (temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
   
    public static void main(String[] args) {
        createLinkedList();
        printLinkedList(createLinkedList());
    }

}

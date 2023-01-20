package com.bootcoding.dsa.linkedlist;

public class TraversingLinkedList {

    static int data;
    Node next;

    public void traversingLinkedList(int data) {
        this.data = data;
        this.next = null;
    }
    public static void main(String[] args) {

       Node head =  createLinkedList();
        traverse(head);
        insert(30 , head, 3);
    }

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
    public static void traverse(Node head){
        Node cur = head;
        while (cur!=null){
            System.out.println(cur.data);
            cur = cur.next;
        }
    }
    public static void insert( int data,Node head ,int pos){
        Node toAdd = new Node(data);
        if(pos == 0){
            toAdd.next = head;
            head = toAdd;
            return;
        }
        Node prev = head;
        for(int i= 0;i<pos-1;i++){
            prev = prev.next;
        }
        toAdd.next = prev.next;
        prev.next=toAdd;
    }
}

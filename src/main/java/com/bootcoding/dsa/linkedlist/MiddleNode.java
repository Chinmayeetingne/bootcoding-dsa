package com.bootcoding.dsa.linkedlist;

public class MiddleNode {

    public static Node createLinkedList() {
        //creation of linked list
        Node firstNode = new Node(1);
        Node secondNode = new Node(2);
        Node thirdNode = new Node(3);
        Node fourthNode = new Node(4);
        Node fifthNode = new Node(5);

        //linking of list
        Node head = firstNode;
        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = fourthNode;
        fourthNode.next = fifthNode;
        fifthNode = null;
        return head;
    }

    public static Node middleNode(Node head) {
        Node temp = head;
        int count = 0;

        while (temp != null) {
            count++;
            temp = temp.next;
        }
        int halfCounter = count / 2;
        temp = head;
        System.out.println(temp);

        for (int i = 0; i < halfCounter; i++) {
            temp = temp.next;
        }
        return temp;
    }


    public static void main(String[] args) {
        Node head = createLinkedList();
        Node node = middleNode(head);
        middleNode(node);
        Node n = middleNode(head);
        while (n != null) {
            System.out.println(n.data);
            n = n.next;
        }
    }
}

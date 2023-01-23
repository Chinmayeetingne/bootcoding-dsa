package com.bootcoding.dsa.linkedlist;

public class DeleteNode {
    public static void main(String[] args) {

        Node firstNode = new Node(4);
        Node secondNode = new Node(5);
        Node thirdNode = new Node(1);
        Node fourthNode = new Node(9);

        Node head = firstNode;
        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = fourthNode;
        fourthNode.next = secondNode;
        // return firstNode;

        System.out.println(deleteNode(head));
    }
    public static boolean deleteNode(Node node) {
        node.data = node.next.data;
        node.next = node.next.next;
        return false;
    }
}

package com.bootcoding.dsa.linkedlist;

public class LinkedListCycle {
    public static void main(String[] args) {

        Node firstNode = new Node(3);
        Node secondNode = new Node(2);
        Node thirdNode = new Node(0);
        Node fourthNode = new Node(-4);

        Node head = firstNode;
        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = fourthNode;
        fourthNode.next = secondNode;
       // return firstNode;

        System.out.println(hasCycle(head));
    }

    public static boolean hasCycle(Node head) {
        Node sp = head;
        Node fp = head;
        while(fp != null && fp.next != null){
            sp =sp.next;
            fp =fp.next.next;
            if(sp == fp){
                return true;
            }
        }
        return false;
    }
}

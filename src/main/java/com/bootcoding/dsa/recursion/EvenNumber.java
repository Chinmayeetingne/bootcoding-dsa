package com.bootcoding.dsa.recursion;

public class EvenNumber {
    public static void main(String[] args) {
        int n = 10;
        even(n);
    }

    public static void even(int n) {
        //base/termination condition
        if (n == 0) {
            return;
        }
        even(n - 1);
        if (n % 2 == 0) {
            System.out.println(n);
        }
    }
}

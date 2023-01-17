package com.bootcoding.dsa.recursion;

public class ArrayUsingRecursion {
    public static void main(String[] args) {
        int a[] = {10,20,30,40,50};
        printArray(a, 0);
    }
    public static void printArray(int[] a, int i){
        if(i == a.length){
            return;
        }
        System.out.println(a[i]);
        printArray(a, ++i);
    }
}

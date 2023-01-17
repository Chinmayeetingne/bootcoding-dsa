package com.bootcoding.dsa.recursion;

public class NaturalNumbers {
    public static void main(String[] args) {
        int n= 50;
        printNaturalNumbers(n);
    }

    public static void printNaturalNumbers(int n){
        if(n==0){
            return;
        }
        printNaturalNumbers(n-1);
        System.out.println(n);
    }
}

package com.bootcoding.dsa.recursion;

public class SumOfNumbers {
    public static void main(String[] args) {
         int n =  15;
        System.out.println(printSum(n));
    }

    public static int printSum(int n) {
        if(n<=1) {
            return n;
        }
            return n +printSum(n-1);
        }
    }


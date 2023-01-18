package com.bootcoding.dsa.recursion;

public class FactorialUsingRecursion {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Factorial of : " + printFact(n));
    }

    public static int printFact(int n){
       if(n == 1){
           return n;
       }

       return n* printFact(n-1);
    }
}

package com.bootcoding.dsa.recursion;

public class powerOfTwo {
    public static void main(String[] args) {
        int n  =2;
        System.out.println(isPowerOfTwo(n));
    }

    public static boolean isPowerOfTwo(int n) {
        if(n<1){
            return false;
        }
        if(n==1){
            return true;
        }
        if(n % 2  == 1){
            return false;
        }
        return isPowerOfTwo(n/2);
    }

}

package com.bootcoding.dsa.recursion;

public class PowerOfNumber {

    public static void main(String[] args) {
        int n= 3, x= 4;
        System.out.println("Power of : " + printPowerOfNum(n,x));
    }
    public static int printPowerOfNum(int n ,int x){
        if(x == 0){
            return 1;
        }
        return n * printPowerOfNum(n ,x-1);
    }
}

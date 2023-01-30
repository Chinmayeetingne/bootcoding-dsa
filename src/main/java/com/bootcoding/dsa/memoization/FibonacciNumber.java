package com.bootcoding.dsa.memoization;

import java.util.HashMap;

public class FibonacciNumber {
    static HashMap<Integer , Integer> cache = new HashMap<>();

    public static void main(String[] args) {

        //to calculate the time required
        long start = System.currentTimeMillis();
        System.out.println(fib(25));
        System.out.println("Total Time (ns):" +(System.currentTimeMillis() - start));
        long start2 = System.currentTimeMillis();
        System.out.println(fibMemoization(25));
        System.out.println("Total Time (memoization) (ns): " + (System.currentTimeMillis() - start2));
    }
    public static int fib(int n){
        if(n == 0 || n == 1){
            return n;
        }
        return fib(n-1) + fib(n-2);
    }


    public static int fibMemoization(int n){
        if(n == 0 || n == 1){
            return n;
        }
        if (cache.containsKey(n)){
            return cache.get(n);
        }
        cache.put(n,fibMemoization(n-1)+ fibMemoization(n-2));
        return cache.get(n);
    }
}

package com.bootcoding.dsa.recursion;

  public class CountTheDigits {
    public static void main(String[] args) {
       int n = 234;
        System.out.println("Number of digits : " + countDigit(n));
    }

    public static int countDigit(int n){
        {
            if (n/10 == 0)
                return 1;
            return 1 + countDigit(n / 10);
        }
    }
}

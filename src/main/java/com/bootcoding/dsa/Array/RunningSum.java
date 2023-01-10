package com.bootcoding.dsa.Array;

public class RunningSum {

    public static void main(String[] args) {
         int[] array = {1,2,3,4};
        System.out.println("Sum are : " + array);
    }

    public int[] getRunningSum(int[] nums) {
        int[] array = {1, 2, 3, 4};
        int sum = 0;

        for (int i = 1; i < array.length; i++) {
            sum = sum + i;
        }
        return array;
    }

}
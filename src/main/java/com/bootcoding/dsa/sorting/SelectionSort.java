package com.bootcoding.dsa.sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int a[] = {50,25,100,3,39};
        System.out.println(Arrays.toString(selectionSort(a)));
    }

    public static int[] selectionSort(int[] a) {
        for (int i = 0; i < a.length ; i++) {
           int minIndex = i;
            for (int j = i + 1; j < a.length; j++) {
                if(a[j] < a[minIndex]) {
                   minIndex = j;
                }
            }
           int temp = a[i];
            a[i] = a[minIndex];
            a[minIndex] = temp;
        }
        return a;
    }
}

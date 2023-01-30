package com.bootcoding.dsa.sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int a[] = {50,25,100,3,39};
       selectionSort(a);
    }

    public static void selectionSort(int[] a) {
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
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]+ " ");
        }
    }
}

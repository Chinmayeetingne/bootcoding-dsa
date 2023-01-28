package com.bootcoding.dsa.sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int a[] = {62,33,3,12,10};
       insertionSort(a);
    }

    public static void insertionSort(int a[]){
        for(int i=1;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                if(a[i]<a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for (int i=0;i<a.length;i++){
            System.out.println(a[i] + "");
        }
    }
}

package com.bootcoding.dsa.matrix;

public class SparseMatrix {
    public static void main(String[] args) {
        int arr[][] = new int[3][3];
        arr[0][0] = 1;arr[0][1] =0;arr[0][2] = 1;
        arr[1][0] = 0;arr[1][1] =1;arr[1][2] =0;
        arr[2][0] =0;arr[2][1] =0;arr[2][2] =0;

       CheckSparseMatrix(arr);

    }
    public static void CheckSparseMatrix(int [][]arr){
        int rows, cols, size, count=0;
         rows = arr.length;
         cols = arr[0].length;
        size = rows * cols;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
               if(arr[i][j] ==0){
                   count++;
               }
            }
        }
        if(count> (size/2)){
            System.out.println("The given matrix is sparse");
        }else {
            System.out.println("The given matrix is  not sparse");
        }
    }
}

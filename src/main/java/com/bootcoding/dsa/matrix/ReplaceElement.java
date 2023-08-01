package com.bootcoding.dsa.matrix;

public class ReplaceElement {
    public static void main(String[] args) {
        int arr[][] = new int[3][3];
        arr[0][0] = 1;arr[0][1] = 2;arr[0][2] = 3;
        arr[1][0] = 0;arr[1][1] = 5;arr[1][2] = 6;
        arr[2][0] = 0;arr[2][1] = 8;arr[2][2] = 9;

        replaceElement(arr);

    }
    private static  void replaceElement(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i][j] == 0){
                    System.out.println(arr[i][j]=1);
                }
                System.out.println(arr[i][j]);
            }
            System.out.println();
            }
        }
    }
package com.bootcoding.dsa.array;

public class ArraySquare {
    public static int[] SquareOfArrayElements(int[] digits) {

        for (int i = 0; i < digits.length; i++) {
            digits[i] = digits[i] * digits[i];
        }
        return digits;
    }

    public static void main(String[] args) {

        int[] nums = {-4, -1, 0, 3, 10};
        int[] result = SquareOfArrayElements(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(result[i]);
        }

    }
}



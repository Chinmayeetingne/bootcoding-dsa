package com.bootcoding.dsa.Array;

public class PositiveArray {
    public static int[] ArrayOfPositiveElements(int[] digits) {
        int PosElements[] = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] > 0 ) {
                PosElements[i] = digits[i];
            }
        }
        return digits;
    }

    public static void main(String[] args) {
        int[] nums = {10, -29, 30, -12};
        int[] result = ArrayOfPositiveElements(nums);
        for (int i = 0; i < result.length; i++) {
            if (result[i] > 0) {
                System.out.println(result[i]);
            }
        }
    }
}

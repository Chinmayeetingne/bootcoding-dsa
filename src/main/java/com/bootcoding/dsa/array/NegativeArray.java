package com.bootcoding.dsa;

public class NegativeArray {
    public static int[] ArrayOfNegativeElements(int[] digits) {
        int negElements[] = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] < 0) {
                negElements[i] = digits[i];
            }

        }
        return digits;
    }

    public static void main(String[] args) {
        int[] nums = {10, -29, 30, -12};
        int[] result = ArrayOfNegativeElements(nums);
        for (int i = 0; i < result.length; i++) {
            //if (result[i] < 0) {
                System.out.println(result[i]);

        }
    }
}

package com.bootcoding.dsa.array;

public class ArrayCube {
    public static int[] CubeOfArrayElements(int[] digits) {

        for (int i = 0; i < digits.length; i++) {
            digits[i] = digits[i] * digits[i]*digits[i];
        }
        return digits;
    }

    public static void main(String[] args) {

        int[] nums = {2, 4, 6};
        int[] result = CubeOfArrayElements(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(result[i]);
        }
    }

}

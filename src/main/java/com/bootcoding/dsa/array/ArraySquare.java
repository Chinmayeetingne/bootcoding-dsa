package com.bootcoding.dsa.array;

public class ArraySquare {
    public static int[] SquareOfArrayElements(int[] digits){

        for(int i =0;i< digits.length;i++){
            digits[i] = digits[i]*digits[i];
        }
        return digits;
    }

    public static void main(String[] args) {

        int [] nums ={2, 4, 6};
        int[] result = SquareOfArrayElements(nums);
        for(int i=0;i< nums.length;i++){
            System.out.println(result[i]);
        }
    }

    public static class ReverseString {
        public void reverseString(char[] s) {
            char[] str = {'h', 'e', 'l', 'l', 'o'};
            s = str;

            for (int i = 0; i < s.length/2; i++) {
                char temp = s[i];
                s[i] = s[s.length - i - 1];
                s[s.length - i - 1] = temp;
            }
            System.out.println(s);
        }


        public static void main(String[] args) {
            ReverseString rs = new ReverseString();
            char[] ch = {'c'};
            rs.reverseString(ch);
        }
    }
}

package com.bootcoding.dsa.Array;

public class ReverseString {
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
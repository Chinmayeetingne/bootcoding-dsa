package com.bootcoding.dsa.array;

public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        String str=s.trim();
        int len =0;
        for(int i=str.length()-1;i>=0;i--){
            if(str.charAt(i) != ' '){
                len++;
            }else{
                break;
            }
        }
        return len;
    }


    public static void main(String[] args) {
        String str = "   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(str));
    }
}
